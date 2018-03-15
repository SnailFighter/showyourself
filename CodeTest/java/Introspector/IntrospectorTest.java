import java.beans.Introspector;
import java.beans.BeanInfo;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;

public class IntrospectorTest{
	public static void main(String[] args) throws Exception{
	
		Person person = new Person();
		person.setName("wang dachui");
		person.setAge(10);
		BeanInfo beanInfo = Introspector.getBeanInfo(person.getClass());
		/*
		String name = Introspector.decapitalize("Name");
		System.out.println("******Field:name*****"+name);
		
		String song = Introspector.decapitalize("song");
		System.out.println("******Not Field:name*****"+song);
		*/
		
		PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
		for (PropertyDescriptor property : propertyDescriptors) {
			String key = property.getName();
			// 
			if (!key.equals("class")) {
				System.out.println("******key******"+key);
				// property'getter
				Method getter = property.getReadMethod();
				if(null==getter){
					System.out.println("Null");
					return;
				}
				Object value = getter.invoke(person);
				
				System.out.println("******value*******"+value);
			}
		}
	
		
	}
}