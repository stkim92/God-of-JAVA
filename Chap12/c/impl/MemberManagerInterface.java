/*
2017.01.23
Chap 11. Practice ,it is writed by st.
*/

package c.impl;

import c.inheritance.MemberDTO;

public interface MemberManagerInterface{
	public boolean addMember(MemberDTO member);
	public boolean removeMember(String name, String phone);
	public boolean updateMember(MemberDTO member);
}
