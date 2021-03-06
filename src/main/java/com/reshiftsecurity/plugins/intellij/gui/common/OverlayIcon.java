/*
 * Copyright 2020 Reshift Security Intellij plugin contributors
 *
 * This file is part of Reshift Security Intellij plugin.
 *
 * Reshift Security Intellij plugin is free software: you can redistribute it
 * and/or modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation, either version 3 of
 * the License, or (at your option) any later version.
 *
 * Reshift Security Intellij plugin is distributed in the hope that it will
 * be useful, but WITHOUT ANY WARRANTY; without even the implied
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Reshift Security Intellij plugin.
 * If not, see <http://www.gnu.org/licenses/>.
 */

package com.reshiftsecurity.plugins.intellij.gui.common;

import javax.swing.Icon;
import java.awt.Component;
import java.awt.Graphics;

/**
 * $Date$
 *
 * @author Andre Pfeiler<andre.pfeiler@gmail.com>
 * @version $Revision$
 * @since 0.9.97
 */
public class OverlayIcon implements Icon {

	protected final Icon[] _icons;
	protected int _maxWidth;
	protected int _maxHeight;


	public OverlayIcon(final Icon... icons) {
		//noinspection AssignmentToCollectionOrArrayFieldFromParameter
		_icons = icons;
		for (final Icon icon : icons) {
			if (icon != null && icon.getIconWidth() > _maxWidth) {
				_maxWidth = icon.getIconWidth();
			}
			if (icon != null && icon.getIconHeight() > _maxHeight) {
				_maxHeight = icon.getIconHeight();
			}
		}
	}


	public void paintIcon(final Component c, final Graphics g, final int x, final int y) {
		for (final Icon icon : _icons) {
			icon.paintIcon(c, g, x, y);
		}
	}


	public int getIconWidth() {
		return _maxWidth;
	}


	public int getIconHeight() {
		return _maxHeight;
	}
}

