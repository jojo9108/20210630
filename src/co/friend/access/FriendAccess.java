package co.friend.access;

import co.friend.model.Friend;

public interface FriendAccess {
	// 동일한 친구의 이름은 없다.
	// 입력 수정 삭제 리스트 이름조회 전화번호조회
	public void insert(Friend friend);
	
	public void update(Friend friend);
	
	public void delete(String name);
	
	public Friend[] selectAll();
	
	public Friend selectOne(String name);
	
	public Friend findTel(String tel);
	
	
	
}
