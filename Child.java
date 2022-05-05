import java.util.ArrayList;
import java.util.List;

public class Child implements Human
{
    private String name;
    private String lastName;

    @Override
    public String getName() 
    {
        return name;
    }

    @Override
    public String getLastName() 
    {
        return lastName;
    }

    public Child(String name, String lastName)
    {
        this.name = name;
        this.lastName = lastName;
    }

    @Override
    public void print() 
    {
        System.out.println("==============================");
        System.out.println("Nome : " + getName());
        System.out.println("Sobrenome : " + getLastName());
        System.out.println("Pais :");
        for (Human parent: parents) {
            System.out.println("  - Nome : " + parent.getName());
        }
        System.out.println("==============================");
    }

    @Override
    public void addChild(Human child) 
    {

    }

    private List<Human> parents = new ArrayList<>();
    @Override
    public void addParent(Human parent) 
    {
        parents.add(parent);
    }
}
