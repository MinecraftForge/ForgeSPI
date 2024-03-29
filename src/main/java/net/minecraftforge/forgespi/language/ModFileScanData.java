/*
 * Copyright (c) Forge Development LLC
 * SPDX-License-Identifier: LGPL-2.1-only
 */
package net.minecraftforge.forgespi.language;


import java.lang.annotation.ElementType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

import org.objectweb.asm.Type;

public class ModFileScanData {
    private final Set<AnnotationData> annotations = new LinkedHashSet<>();
    private final Set<ClassData> classes = new LinkedHashSet<>();
    private final Map<String,IModLanguageProvider.IModLanguageLoader> modTargets = new HashMap<>();
    private final List<IModFileInfo> modFiles = new ArrayList<>();

    @Deprecated(forRemoval = true, since = "7.1")
    public static Predicate<Type> interestingAnnotations() {
        return t -> true;
    }

    public Set<ClassData> getClasses() {
        return classes;
    }

    public Set<AnnotationData> getAnnotations() {
        return annotations;
    }

    public void addLanguageLoader(final Map<String,? extends IModLanguageProvider.IModLanguageLoader> modTargetMap) {
        modTargets.putAll(modTargetMap);
    }

    public void addModFileInfo(IModFileInfo info) {
        this.modFiles.add(info);
    }

    public Map<String, ? extends IModLanguageProvider.IModLanguageLoader> getTargets() {
        return modTargets;
    }

    public List<IModFileInfo> getIModInfoData() {
        return this.modFiles;
    }

    public record ClassData(Type clazz, Type parent, Set<Type> interfaces) {}

    public record EnumData(Type clazz, String value) {}

    public record AnnotationData(Type annotationType, ElementType targetType, Type clazz, String memberName, Map<String, Object> annotationData) {}
}
