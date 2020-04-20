package com.zpf.mq;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.zpf.pojo.Order;
import jdk.nashorn.internal.ir.Flags;
import org.junit.Test;

public class MqTest {
	HelloWorldConsumer consumer = new HelloWorldConsumer();
	HelloWorldProducer producer = new HelloWorldProducer();
	/*public static void main(String[] args) {
		HelloWorldConsumer consumer = new HelloWorldConsumer();
		HelloWorldProducer producer = new HelloWorldProducer();
		consumer.reciveHelloWorldFromActiveMQ();
		//producer.sendHelloWorld2ActiveMQ("test---mq"+(System.currentTimeMillis()));
	}*/

	//@Test
	public void testMqByObject(){

		for (int i = 100000; i <100010 ; i++) {
			Order order = new Order(i,3,"苹果");

			String orderMsg= JSON.toJSONString(order);

			producer.sendHelloWorld2ActiveMQ(orderMsg);
		}

	}
	//@Test
	public void readMqByObject(){
		boolean flag = true;
		while (flag){
			String msg = consumer.reciveHelloWorldFromActiveMQ();
			if(msg==""){
				flag=false;
				break;
			}
		}
		//System.out.println("------读取队列内容结束");
	}

	@Test
	public void readMqByListener(){

		consumer.reciveHelloWorldFromActiveMQ();
	}
}
