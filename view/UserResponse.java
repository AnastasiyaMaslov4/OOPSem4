package view;

public class UserResponse {
    
    private Object message;

    public UserResponse(Object msg) {
        this.message = msg;
    }

    @Override
    public String toString() {
        return message.toString();
    }

}
