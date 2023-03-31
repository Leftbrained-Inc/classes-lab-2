import javax.swing.text.View;

// Implementation of an abstract class as a Home cat
public class HomeCat extends Cat {
        public String name;
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }

        public HomeCat() {
                super();
                this.name = "No Name";
        }

        public HomeCat(int a, String n) {
                super(a);
                this.name = n;
        }

        public void View() {
               System.out.println("Home cat - " + this.name + " Age - " + this.getAge());
        }
}
