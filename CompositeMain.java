public class CompositeMain {

    public static void main(String[] args) {

        Child carlos = new Child("Carlos", "Carvalho");
        Parent felipe = new Parent("Felipe", "Carvalho");
        Parent amelia = new Parent("Amélia", "Pinheiro");

        carlos.addParent(felipe);
        carlos.addParent(amelia);
        felipe.addChild(carlos);
        amelia.addChild(carlos);

        GrandParent cesar = new GrandParent("César", "Carvalho");

        cesar.addChild(felipe);
        felipe.addParent(cesar);

        cesar.print();
        felipe.print();
        carlos.print();
    }
}
