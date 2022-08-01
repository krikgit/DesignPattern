package structural.decorator.example.casual;

abstract class Component {
    abstract void doJob();
}

class  ConcreteComponent extends Component{

    @Override
    void doJob() {
        System.out.println("I am from concrete component and closed for modification.!!");
    }
}
