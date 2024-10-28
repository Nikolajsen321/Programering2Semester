package Testeksamen.navigation;

import java.util.ArrayList;

public class NavigationMenu extends NavigationComponent
{
    private String name;
    private ArrayList<NavigationComponent> navigationComponents = new ArrayList<>();

    public NavigationMenu(String name)
    {
        this.name = name;
    }



    public void print()
    {
        System.out.println();
        System.out.println(name);
        for(NavigationComponent navigationComponent : getChildren()) {
            navigationComponent.print();
        }
    }

    public String getName(){
        return this.name;
    }

    public void addChild(NavigationComponent navigationComponent)
    {
        navigationComponents.add(navigationComponent);

    }

    public ArrayList<NavigationComponent> getChildren()
    {
     return new ArrayList<>(navigationComponents);
    }


}
