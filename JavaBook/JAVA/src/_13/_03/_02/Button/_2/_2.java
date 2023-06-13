package _13._03._02.Button._2;

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

public class _2 {
    public static void main(String[] args) {
        Button button2  = new Button();
        button2.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick() {
                System.out.println("개발자 2. 네이버 접속");
            }
        });
        button2.click();
    }
}
