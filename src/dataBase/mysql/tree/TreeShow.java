package dataBase.mysql.tree;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import dataBase.mysql.DbUtils;

/**
 * mysql由于没有startWith connectBy所以需自己写一个小工具来展示树结构
 * @author yangzhan-xps13
 *
 */
public class TreeShow {
	
	@Test
	public void showTreeByNode() {
		String nodeId = "2c904ef35cf76f1c015cf88da47a0021";
		String sql = "SELECT * FROM system_permission t1";
		List<TreeNode> list = new ArrayList<TreeNode>();
		Statement state = DbUtils.getStatement();
		try {
			ResultSet rs = state.executeQuery(sql);
			while(rs.next()) {
				TreeNode obj = new TreeNode();
				obj.setId(rs.getString("id"));
				obj.setLeaf("Y".equals(rs.getString("leaf_")));
				obj.setLevel(rs.getInt("level_"));
				obj.setOrder(rs.getDouble("order_"));
				obj.setName(rs.getString("display_name"));
				obj.setSingle(rs.getString("name"));
				obj.setMenu("1".equals(rs.getString("menu")));
				obj.setParentId(rs.getString("parent_"));
				list.add(obj);
			}
			
			System.out.println(list.size());
			List<TreeNode> sortList = new ArrayList<TreeNode>();
			findParent(sortList, list, nodeId);
			show(sortList);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		DbUtils.close();
	}
	
	
	public void findParent(List<TreeNode> sort, List<TreeNode> list, String nodeId) {
		String parentId = null;
		for(int i=0; i<list.size(); i++) {
			TreeNode obj = list.get(i);
			if(nodeId.equals(obj.getId())) {
				sort.add(obj);
				parentId = obj.getParentId();
			}
		}
		if(parentId != null) {
			findParent(sort, list, parentId);
		}
	}
	
	public void show(List<TreeNode> sort){
		int leve = 0;
		for(int i= sort.size()-1; i>=0; i--) {
			TreeNode obj = sort.get(i);
			
			for(int j=0; j<leve; j++) {
				
			}
			System.out.println(obj.getId() + "\t" + obj.getName() + "\t" + obj.getSingle() + "\t" + obj.getParentId());
		}
	}
}
