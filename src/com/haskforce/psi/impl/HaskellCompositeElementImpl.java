package com.haskforce.psi.impl;

import com.haskforce.psi.HaskellCompositeElement;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;

public class HaskellCompositeElementImpl extends ASTWrapperPsiElement implements HaskellCompositeElement {
    public HaskellCompositeElementImpl(ASTNode node) {
        super(node);
    }

    @Override
    public String toString() {
        return getNode().getElementType().toString();
    }
}
