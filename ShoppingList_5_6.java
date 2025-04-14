import java.util.*;

class Items{
    Vector<String> items = new Vector<String>();
    public void addItem(String item){
        items.add(item);
    }
    public void addAt(int pos, String item){
        items.add(pos-1, item);
    }

    public void remove(String item){
        items.remove(item);
    }

    public void printAll(){
        System.out.println("");
        for(String item : items){
            System.out.println(item);
        }
        System.out.println("");
    }
}

class ShoppingList{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        Items items = new Items();
        System.out.println("Enter five items: ");
        for(int i=0; i<5; i++)
            items.addItem(scn.nextLine());
            
        String item;
        while(true){
            System.out.println("Enter 1) for insert at end \n2) for insert at position \n3)for remove \n4) for print all \n5) for exit\n");
            int choice = Integer.parseInt(scn.nextLine()); // using next line because nextint doesn't consume the \n
            switch(choice){
                case 1:
                    System.out.println("Enter the item: ");
                    item = scn.nextLine();
                    items.addItem(item);
                    break;
                case 2:
                    System.out.println("Enter position : ");
                    int pos = Integer.parseInt(scn.nextLine());
                    System.out.println("Enter item : ");
                    item = scn.nextLine();
                    items.addAt(pos, item);
                    break;
                case 3:
                    System.out.println("Enter item to remove : ");
                    item = scn.nextLine();
                    items.remove(item);
                    break;
                case 4:
                    items.printAll();
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }

    }
}