package co.friend.access;

import java.util.List;

import co.friend.model.Friend;

// FriendAccess(인터페이스)를 구현하는 객체.
// 파일에 저장.
public class FriendDB implements FriendAccess {

	@Override
	public void insert(Friend friend) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Friend friend) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(String name) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Friend> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Friend selectOne(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Friend findTel(String tel) {
		// TODO Auto-generated method stub
		return null;
	}

}
