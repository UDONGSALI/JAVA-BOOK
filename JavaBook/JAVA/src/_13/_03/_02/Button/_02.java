package _13._03._02.Button;

class Button{
    OnClickListener oc1;
    void setOnClickListener(OnClickListener oc1){
        this.oc1 = oc1;
    }
    interface OnClickListener{
        public abstract void onClick();
    }
    void click(){
        oc1.onClick();
    }
}

public class _02 {
    public static void main(String[] args) {
        Button button1 = new Button();
        button1.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick() {
                System.out.println("개발자 1. 음악재생");
            }
        });
        button1.click();
    }
}
