package spring.mvc.selenium.express;

public class User {
private String email;
private String userName;
private String userpassword;


public User() {
	super();
	// TODO Auto-generated constructor stub
}
public User(String email, String userName, String userpassword) {
	super();
	this.email = email;
	this.userName = userName;
	this.userpassword = userpassword;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getUserpassword() {
	return userpassword;
}
public void setUserpassword(String userpassword) {
	this.userpassword = userpassword;
}
@Override
public String toString() {
	return "User [email=" + email + ", userName=" + userName + ", userpassword=" + userpassword + "]";
}


}
