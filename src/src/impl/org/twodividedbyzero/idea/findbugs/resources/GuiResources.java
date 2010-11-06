/**
 * Copyright 2008 Andre Pfeiler
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package org.twodividedbyzero.idea.findbugs.resources;

import javax.swing.Icon;
import java.awt.Color;
import java.awt.Font;
import java.util.HashMap;
import java.util.Map;


/**
 * $Date$
 *
 * @author Andre Pfeiler<andrep@twodividedbyzero.org>
 * @version $Revision$
 * @since 0.0.1
 */
@SuppressWarnings({"HardCodedStringLiteral"})
public class GuiResources {

	public static final Icon FINDBUGS_ICON = ResourcesLoader.loadIcon("bug.png");
	public static final Icon FINDBUGS_CONFIGURATION_ICON = ResourcesLoader.loadIcon("smallBuggy.png");
	public static final Icon FINDBUGS_EXECUTE_ICON = ResourcesLoader.loadIcon("actions/bug18x18.png");

	public static final Icon CLOSE_EDITOR_ICON = ResourcesLoader.loadIcon("close.png");
	public static final Icon CLOSE_EDITOR_HOVER_ICON = ResourcesLoader.loadIcon("closeHovered.png");

	private static final int fontSize = 12;
	public static final Font SOURCE_FONT = new java.awt.Font("Monospaced", 0, fontSize);
	public static final Font JTREE_FONT = new java.awt.Font("SansSerif", 0, fontSize);
	public static final Font LABEL_FONT = new java.awt.Font("Dialog", 1, 2 * fontSize);
	public static final Font BUTTON_FONT = new java.awt.Font("Dialog", 0, fontSize);

	public static final Color HIGH_PRIORITY_COLOR = Color.RED;
	public static final Color MIDDLE_PRIORITY_COLOR = Color.YELLOW;
	public static final Color LOW_PRIORITY_COLOR = Color.GREEN;
	public static final Color EXP_PRIORITY_COLOR = Color.BLACK;

	public static final Icon PRIORITY_HIGH_ICON = ResourcesLoader.loadIcon("priority/bug_hiigh.png");
	public static final Icon PRIORITY_NORMAL_ICON = ResourcesLoader.loadIcon("priority/bug_normal.png");
	public static final Icon PRIORITY_LOW_ICON = ResourcesLoader.loadIcon("priority/bug_low.png");
	public static final Icon PRIORITY_EXP_ICON = ResourcesLoader.loadIcon("priority/bug_exp.png");

	/**
	 * --------------------------------------------------------------------------------------------------
	 * Grouping icons
	 */
	public static final Icon GROUP_BY_CATEGORY_ICON = ResourcesLoader.loadIcon("actions/groupByBugCategory.png");
	public static final Icon GROUP_BY_CLASS_ICON = ResourcesLoader.loadIcon("actions/groupByClass.png");
	public static final Icon GROUP_BY_RANK_ICON = ResourcesLoader.loadIcon("actions/groupByRank.png");
	public static final Icon GROUP_BY_PRIORITY_ICON = ResourcesLoader.loadIcon("actions/groupByPriority.png");
	public static final Icon GROUP_BY_PACKAGE_ICON = ResourcesLoader.loadIcon("actions/groupByPackage.png");

	public static final Icon GROUP_BY_RANK_SCARIEST_ICON = ResourcesLoader.loadIcon("priority/rankScariest.png");
	public static final Icon GROUP_BY_RANK_SCARY_ICON = ResourcesLoader.loadIcon("priority/rankScary.png");
	public static final Icon GROUP_BY_RANK_TROUBLING_ICON = ResourcesLoader.loadIcon("priority/rankTroubling.png");
	public static final Icon GROUP_BY_RANK_OF_CONCERN_ICON = ResourcesLoader.loadIcon("priority/rankOfConcern.png");
	public static final Map<String, Icon> GROUP_BY_RANK_ICONS = new HashMap<String, Icon>(4);

	static {
		GROUP_BY_RANK_ICONS.put("SCARIEST", GROUP_BY_RANK_SCARIEST_ICON);
		GROUP_BY_RANK_ICONS.put("SCARY", GROUP_BY_RANK_SCARY_ICON);
		GROUP_BY_RANK_ICONS.put("TROUBLING", GROUP_BY_RANK_TROUBLING_ICON);
		GROUP_BY_RANK_ICONS.put("OF_CONCERN", GROUP_BY_RANK_OF_CONCERN_ICON);
	}

	public static final Icon GROUP_BY_PRIORITY_HIGH_ICON = ResourcesLoader.loadIcon("priority/priorityHigh.png");
	public static final Icon GROUP_BY_PRIORITY_MEDIUM_ICON = ResourcesLoader.loadIcon("priority/priorityMedium.png");
	public static final Icon GROUP_BY_PRIORITY_LOW_ICON = ResourcesLoader.loadIcon("priority/priorityLow.png");
	public static final Icon GROUP_BY_PRIORITY_EXP_ICON = ResourcesLoader.loadIcon("priority/priorityExp.png");
	public static final Icon GROUP_BY_PRIORITY_IGNORE_ICON = ResourcesLoader.loadIcon("priority/priorityIgnore.png");
	public static final Map<String, Icon> GROUP_BY_PRIORITY_ICONS = new HashMap<String, Icon>(5);


	static {
		GROUP_BY_PRIORITY_ICONS.put("Low", GROUP_BY_PRIORITY_LOW_ICON);
		GROUP_BY_PRIORITY_ICONS.put("Medium", GROUP_BY_PRIORITY_MEDIUM_ICON);
		GROUP_BY_PRIORITY_ICONS.put("High", GROUP_BY_PRIORITY_HIGH_ICON);
		GROUP_BY_PRIORITY_ICONS.put("Exp", GROUP_BY_PRIORITY_EXP_ICON);
		GROUP_BY_PRIORITY_ICONS.put("Ignore", GROUP_BY_PRIORITY_IGNORE_ICON); // this should never happen
	}


	/**
	 * --------------------------------------------------------------------------------------------------
	 * Tree icons
	 */
	public static final Icon TREENODE_OPEN_ICON = ResourcesLoader.loadIcon("nodes/TreeOpen.png");
	public static final Icon TREENODE_CLOSED_ICON = ResourcesLoader.loadIcon("nodes/TreeClosed.png");


	/**
	 * --------------------------------------------------------------------------------------------------
	 * Navigation icons
	 */
	public static final Icon NAVIGATION_MOVEUP_ICON = ResourcesLoader.loadIcon("actions/moveUp.png");
	public static final Icon NAVIGATION_MOVEDOWN_ICON = ResourcesLoader.loadIcon("actions/moveDown.png");


	private GuiResources() {

	}

}
