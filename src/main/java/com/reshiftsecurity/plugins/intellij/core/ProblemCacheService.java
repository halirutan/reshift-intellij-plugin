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
package com.reshiftsecurity.plugins.intellij.core;

import com.intellij.psi.PsiFile;
import org.jetbrains.annotations.NotNull;
import com.reshiftsecurity.plugins.intellij.common.ExtendedProblemDescriptor;
import com.reshiftsecurity.plugins.intellij.common.util.New;

import java.util.*;
import java.util.concurrent.ConcurrentMap;

public class ProblemCacheService {

    private final ConcurrentMap<PsiFile, List<ExtendedProblemDescriptor>> problems;

    public ProblemCacheService() {
        problems = New.concurrentMap();
    }

    @NotNull
    public Map<PsiFile, List<ExtendedProblemDescriptor>> getProblems() {
        return problems;
    }
}
