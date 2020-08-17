package design.chain;

public abstract class User {

    //下家
    private User next;

    //责任链方法
    public abstract void chain(int level);

    public User getUser() {
        return next;
    }

    public User(User next) {
        this.next = next;
    }


}
