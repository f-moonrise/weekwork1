package pojo;

/**
 * @author zangye03@gmail.com
 * @date 2020/1/14 14:52
 */
public class Users {
    private Integer id;
    private String username;
    private String password;
    private int score;
    private int type;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Users(){

    }

    public Users(Integer id, String username, String password,int score,int type) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.score = score;
        this.type = type;
    }
}
