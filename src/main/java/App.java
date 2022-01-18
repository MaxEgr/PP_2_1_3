import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld beanOne = (HelloWorld) applicationContext.getBean("helloworld!");
        System.out.println(bean.getMessage());
        Cat bean1 = applicationContext.getBean("cat", Cat.class);
        System.out.println(bean1.getMessageCat());
        Cat bean2 = applicationContext.getBean("cat", Cat.class);
        System.out.println(bean2.getMessageCat());
        System.out.println(bean == beanOne);
        System.out.println(bean1 == bean2);

    }
}