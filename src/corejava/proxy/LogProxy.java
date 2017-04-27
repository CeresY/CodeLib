package corejava.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class LogProxy implements InvocationHandler {
	private Object target;
	public Object bind(Object object) {
		this.target = object;
		return Proxy.newProxyInstance(object.getClass().getClassLoader(), 
				object.getClass().getInterfaces(), this);
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		
		System.out.println("代理之前");
		Object result = method.invoke(target, args);
		System.out.println("代理之后");
		return result;
	}

}
