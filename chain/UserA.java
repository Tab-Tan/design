package design.chain;

public class UserA extends User {

    public UserA(User next) {
        super(next);
    }

    @Override
    public void chain(int level) {
        if (level>80&&level<91){
            System.out.println("[A级鉴定师]鉴定结果为:魂斗罗境界");
        }else if(level>90){
            System.out.println("A级鉴定师:鉴定结果为:封号斗罗及以上境界");
        }else {
            if (this.getUser()!=null){
                getUser().chain(level);
            }else {
                System.out.println("年轻人，鉴定结束了努力每年再来吧。");
            }
        }
    }

}
