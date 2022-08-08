package behavioral.visitor.assignment;

interface Visitor {
    public void visit(Book book);
    public void visit(CD cd);
    public void visit(DVD dvd);

    public double getPostageCost();

}

class NAVisitorImpl implements Visitor{

    private double postageCost=0;

    @Override
    public void visit(Book book) {
        if (book.getPrice()<20){
            postageCost += book.getWeight()*2;
        }
    }

    @Override
    public void visit(CD cd) {
        if (cd.getPrice()<20){
            postageCost += cd.getWeight()*2.5;
        }
    }

    @Override
    public void visit(DVD dvd) {
        if (dvd.getPrice()<20){
            postageCost += dvd.getWeight()*2.5;
        }
    }

    public double getPostageCost(){
        return postageCost;
    }
}
class SAVisitorImpl implements Visitor{

    private double postageCost=0;

    @Override
    public void visit(Book book) {
        if (book.getPrice()<30){
            postageCost += book.getWeight()*2+2;
        }
    }

    @Override
    public void visit(CD cd) {
        if (cd.getPrice()<30){
            postageCost += cd.getWeight()*2.5+2;
        }
    }

    @Override
    public void visit(DVD dvd) {
        if (dvd.getPrice()<30){
            postageCost += dvd.getWeight()*2.5+2;
        }
    }
    public double getPostageCost(){
        return postageCost;
    }
}
