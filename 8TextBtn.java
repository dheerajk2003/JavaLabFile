import java.awt.*;

class TextBtn{
    public static void main(String[] args){
        Frame f = new Frame("Student Form");

        TextField RollNumber = new TextField();
        TextField Name = new TextField();
        TextField Marks = new TextField();

        Label lr = new Label("Roll Number - ");
        Label ln = new Label("Student Name - ");
        Label lm = new Label("Total Marks - ");

        Button Done = new Button("Done");

        RollNumber.setBounds(120, 20, 100, 20);
        Name.setBounds(120, 50, 100, 20);
        Marks.setBounds(120, 80, 100, 20);
        Done.setBounds(125, 110, 80, 20);
        lr.setBounds(20,20, 90, 20);
        ln.setBounds(20,50, 90, 20);
        lm.setBounds(20,80, 90, 20);

        f.setSize(800, 500);
        f.add(lr);
        f.add(ln);
        f.add(lm);
        f.add(RollNumber);
        f.add(Name);
        f.add(Marks);
        f.add(Done);
        f.setLayout(null);
        f.setVisible(true);
    }
}