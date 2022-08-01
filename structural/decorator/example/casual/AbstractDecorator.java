package structural.decorator.example.casual;

abstract class AbstractDecorator extends  Component{
    protected Component component;
    public void setComponent(Component component){
        this.component = component;
    }

    public void doJob(){
        if (component != null){
            component.doJob();
        }
    }
}

class  ConcreteDecoratorEx_1 extends AbstractDecorator{
    public void doJob(){
        super.doJob();
        System.out.println("I am from ConcreteDecoratorEx_1");
    }
}

class  ConcreteDecoratorEx_2 extends AbstractDecorator{
    public void doJob(){
        super.doJob();
        System.out.println("I am from ConcreteDecoratorEx_2");
    }
}