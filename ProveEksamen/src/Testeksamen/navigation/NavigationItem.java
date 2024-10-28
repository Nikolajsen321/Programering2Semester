package Testeksamen.navigation;

public class NavigationItem extends NavigationComponent
{
    private String name;
    private String link;

    public NavigationItem(String name, String link)
    {
        this.name = name;
        this.link = link;
    }


    public String getName()
    {
        return this.name;

    }

    public String getLink()
    {
        return this.link;

    }

    public void print()
    {
        System.out.println(getName() + " " + getLink() + "\n");
    }



}
