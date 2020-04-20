package com.zpf.mq;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageProducer;
import javax.jms.Session;

import org.apache.activemq.ActiveMQConnectionFactory;

public class HelloWorldProducer {

	/**
	 * @Description:  消息生成者代码
	 * @param messageText  - 要发送的文本消息
	 * @author Kerwin Kim
	 * @date   2017年10月11日
	 */
	public void sendHelloWorld2ActiveMQ(String messageText){
		// 定义链接工厂
		ConnectionFactory connectionFactory = null;
		// 定义链接
		Connection connection = null;
		// 定义会话
		Session session = null;
		// 定义目的地
		Destination destination = null;
		// 定义消息生成者
		MessageProducer producer = null;
		// 定义消息
		Message message = null;
		try{
			
			/*
			 * 创建链接工厂
			 * ActiveMQConnectionFactory - 由ActiveMQ实现的ConnectionFactory接口实现类.
			 * 构造方法: public ActiveMQConnectionFactory(String userName, String password, String brokerURL)
			 *  userName - 访问ActiveMQ服务的用户名, 用户名可以通过jetty-realm.properties配置文件配置.
			 *  password - 访问ActiveMQ服务的密码, 密码可以通过jetty-realm.properties配置文件配置.
			 *  brokerURL - 访问ActiveMQ服务的路径地址. 路径结构为 - 协议名://主机地址:端口号
			 *      此链接基于TCP/IP协议.
			 */
			connectionFactory = new ActiveMQConnectionFactory("admin", "admin", "tcp://47.101.167.97:61616");
			
			// 创建链接对象
			connection = connectionFactory.createConnection();
			// 启动链接
			connection.start();
			
			/*
			 * 创建会话对象
			 * 方法 - connection.createSession(boolean transacted, int acknowledgeMode);
			 *  transacted - 是否使用事务, 可选值为true|false
			 *      true - 使用事务, 当设置此变量值, 则acknowledgeMode参数无效, 建议传递的acknowledgeMode参数值为
			 *          Session.SESSION_TRANSACTED
			 *      false - 不使用事务, 设置此变量值, 则acknowledgeMode参数必须设置.
			 *  acknowledgeMode - 消息确认机制, 可选值为:
			 *      Session.AUTO_ACKNOWLEDGE - 自动确认消息机制
			 *      Session.CLIENT_ACKNOWLEDGE - 客户端确认消息机制
			 *      Session.DUPS_OK_ACKNOWLEDGE - 有副本的客户端确认消息机制
			 */
			session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
			
			// 创建目的地, 目的地命名即队列命名, 消息消费者需要通过此命名访问对应的队列
			destination = session.createQueue("helloworld-distination");
			
			// 创建消息生成者, 创建的消息生成者与某目的地对应, 即方法参数目的地.
			producer = session.createProducer(destination);
			
			// 创建消息对象, 创建一个文本消息, 此消息对象中保存要传递的文本数据.
			message = session.createTextMessage(messageText);
			
			// 发送消息
			producer.send(message);
			
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("访问ActiveMQ服务发生错误!!");
		}finally{
			try {
				// 回收消息发送者资源
				if(null != producer)
					producer.close();
			} catch (JMSException e) {
				e.printStackTrace();
			}
			try {
				// 回收会话资源
				if(null != session)
					session.close();
			} catch (JMSException e) {
				e.printStackTrace();
			}
			try {
				// 回收链接资源
				if(null != connection)
					connection.close();
			} catch (JMSException e) {
				e.printStackTrace();
			}
		}
	}
	
}