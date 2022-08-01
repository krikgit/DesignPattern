package structural.adapter.object_adapter.bird_example;

//presenting turkey as duck
public class TurkeyAdapter implements Duck{
    private Turkey turkey;

    public TurkeyAdapter(Turkey turkey){
        this.turkey = turkey;
    }
    //as turkey interface does not have quack
    public void quack(){
        //but sound is different
        turkey.gobble();
    }

    public void fly(){
        for (int i=0;i<3;i++){
            turkey.fly();
        }
    }
}
