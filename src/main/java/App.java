import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld beanCopy =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.equals(beanCopy));

        Cat catBean =
                (Cat) applicationContext.getBean("cat");
        Cat catBeanAnother =
                (Cat) applicationContext.getBean("cat");
        System.out.println(catBean.equals(catBeanAnother));

        System.out.println(bean.getMessage());
        System.out.println(catBean.getName());
    }
}