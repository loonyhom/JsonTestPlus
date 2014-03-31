package struts2jsonjquery.test.action;

import java.util.ArrayList;

import java.util.HashMap;

import java.util.List;

import java.util.Map;

import struts2jsonjquery.test.entity.UserInfo;

import com.opensymphony.xwork2.ActionSupport;

public class JsonJqueryStruts2Action extends ActionSupport {

    private static final long serialVersionUID = 3518833679938898354L;

    private String message; // 使用json返回单个值

    private UserInfo userInfo; // 使用json返回对象

    private List<UserInfo> userInfosList; // 使用josn返回List对象

    private Map<String, UserInfo> userInfosMap; // 使用json返回Map对象

    /**
     * 
     * <p>
     * 
     * 返回单个值
     * 
     * <p>
     * 
     * @return
     */

    public String returnMessage() {

        this.message = "return single vaule: struts2JqueryJson";

        return "message";

    }

    /**
     * 
     * <p>
     * 
     * 返回UserInfo对象
     * 
     * </p>
     * 
     * @return
     */

    public String returnUserInfo() {

        userInfo = new UserInfo();

        userInfo.setUserId(10000);

        userInfo.setUserName("lorde royals");

        userInfo.setPassword("royals");

        return "userInfo";

    }

    /**
     * 
     * <p>
     * 
     * 返回List对象
     * 
     * </p>
     * 
     * @return
     */

    public String returnList() {

        userInfosList = new ArrayList<UserInfo>();

        UserInfo u1 = new UserInfo();

        u1.setUserId(10000);

        u1.setUserName("lorde royals");

        u1.setPassword("royals");

        UserInfo u2 = new UserInfo();

        u2.setUserId(10001);

        u2.setUserName("kim sung ryoung");

        u2.setPassword("ryoung");

        UserInfo u3 = new UserInfo();

        u3.setUserId(10002);

        u3.setUserName("jordan carver");

        u3.setPassword("jordan");

        UserInfo u4 = new UserInfo();

        u4.setUserId(10003);

        u4.setUserName("Michael Jordan");

        u4.setPassword("Michael");

        userInfosList.add(u1);

        userInfosList.add(u2);

        userInfosList.add(u3);

        userInfosList.add(u4);

        return "list";

    }

    /**
     * 
     * <p>
     * 
     * 返回Map对象
     * 
     * </p>
     * 
     * @return
     */

    public String returnMap() {

        userInfosMap = new HashMap<String, UserInfo>();

        UserInfo u1 = new UserInfo();

        u1.setUserId(10000);

        u1.setUserName("Michael Jordan");

        u1.setPassword("Jordan");

        UserInfo u2 = new UserInfo();

        u2.setUserId(10001);

        u2.setUserName("Scottie Pippen");

        u2.setPassword("Pippen");

        UserInfo u3 = new UserInfo();

        u3.setUserId(10002);

        u3.setUserName("Dennis Rodman");

        u3.setPassword("Rodman");

        UserInfo u4 = new UserInfo();

        u4.setUserId(10003);

        u4.setUserName("Toni Kukoc");

        u4.setPassword("Kukoc");

        UserInfo u5 = new UserInfo();

        u5.setUserId(10004);

        u5.setUserName("Steve Kerr");

        u5.setPassword("Kerr");

        userInfosMap.put(u1.getUserId() + "", u1);

        userInfosMap.put(u2.getUserId() + "", u2);

        userInfosMap.put(u3.getUserId() + "", u3);

        userInfosMap.put(u4.getUserId() + "", u4);

        userInfosMap.put(u5.getUserId() + "", u5);

        return "map";

    }

    /**
     * 
     * <p>
     * 
     * 获得对象，也就是通过表达获得对象(异步的)
     * 
     * </P>
     * 
     * @return
     */

    public String gainUserInfo() {

        System.out.println("UserID：" + userInfo.getUserId());

        System.out.println("UserName：" + userInfo.getUserName());

        System.out.println("Password：" + userInfo.getPassword());

        return "userInfo";

    }

    public String getMessage() {

        return message;

    }

    public void setMessage(String message) {

        this.message = message;

    }

    public UserInfo getUserInfo() {

        return userInfo;

    }

    public void setUserInfo(UserInfo userInfo) {

        this.userInfo = userInfo;

    }

    public List<UserInfo> getUserInfosList() {

        return userInfosList;

    }

    public void setUserInfosList(List<UserInfo> userInfosList) {

        this.userInfosList = userInfosList;

    }

    public Map<String, UserInfo> getUserInfosMap() {

        return userInfosMap;

    }

    public void setUserInfosMap(Map<String, UserInfo> userInfosMap) {

        this.userInfosMap = userInfosMap;

    }

}