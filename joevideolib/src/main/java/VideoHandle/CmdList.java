package VideoHandle;

import java.util.ArrayList;



/**
 * Copyright (C), 1999-2023
 * <p>
 * @author qfmeng6@163.com
 * @date 2025/11/22 14:00
 * <p>
 * @description: 命令集合
 * <p>
 * @version:
 * @revise:
 *
 */
public class CmdList extends ArrayList<String> {

	public CmdList append(String s) {
		this.add(s);
		return this;
	}

	public CmdList append(int i) {
		this.add(i + "");
		return this;
	}

	public CmdList append(float f) {
		this.add(f + "");
		return this;
	}

	public CmdList append(StringBuilder sb) {
		this.add(sb.toString());
		return this;
	}

	public CmdList append(String[] ss) {
		for (String s:ss) {
			if(!s.replace(" ","").equals("")) {
				this.add(s);
			}
		}
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (String s : this) {
			sb.append(" ").append(s);
		}
		return sb.toString();
	}
}
