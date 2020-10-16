
package view;


public class ConsoleRender implements IRender{

    @Override
    public void showMsg(String str) {
        System.out.println(str);
    }
    
}
