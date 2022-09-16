package bridge.without;

public class AdminUI extends UserUI {
   public AdminUI() {
       super();
   }

   @Override
   public void render() {
       super.render();
       System.out.println("Some information visible to Admin on Windows");
   }
}
