package schoo.service;

import org.springframework.stereotype.Service;

import schoo.entity.UserEntity;
import schoo.form.UserForm;

/**
 * ユーザ用処理Serviceクラス
 */
@Service
public class UserServiceImpl implements UserService {
	/**
	 * ユーザFormの内容をEntityに変換して返します.
	 * @param userForm ユーザForm情報
	 * @return ユーザEntityクラス
	 */
	public UserEntity createUser(UserForm userForm) {
		// FormクラスからEntityクラスに情報を詰め替え
		System.out.println("----- Serviceクラス createUser メソッド開始 -----");
		UserEntity userEntity = new UserEntity();
		userEntity.setUserName(userForm.getUserName());
		userEntity.setAge(userForm.getAge());
		System.out.println("----- Serviceクラス createUser メソッド終了 -----");
		return userEntity;
	}
}