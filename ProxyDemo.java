import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by horse on 2017/5/1.
 */
public class ProxyDemo {
	public static void main(String[] args) {
		final Student student=new Student();

		Person person= (Person) Proxy.newProxyInstance(student.getClass().getClassLoader(), student.getClass().getInterfaces(),
				new InvocationHandler() {
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						boolean flag=false;
						Object object=null;
						System.out.println("abc");
						if (flag)
						 	object=method.invoke(student,args);
						System.out.println("zzzzzzzzzzzzzzzz");
						return object;
					}
				});
		person.say("zzzz");
	}
}
