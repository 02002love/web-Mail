package action;

import model.Users;

import com.opensymphony.xwork2.ActionSupport;

import dao.UsersDAO;

public class UsersAction extends ActionSupport {
	private String username;
	private String password;
	private UsersDAO usersDAO;

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

	public UsersDAO getUsersDAO() {
		return usersDAO;
	}

	public void setUsersDAO(UsersDAO usersDAO) {
		this.usersDAO = usersDAO;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		Users users = new Users();
		users = (Users) usersDAO.findByMingcheng(username);
		if (users != null) {
			return SUCCESS;
		} else {
			return INPUT;
		}
	}

}
