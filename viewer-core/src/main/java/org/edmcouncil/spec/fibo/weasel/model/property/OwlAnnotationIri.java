package org.edmcouncil.spec.fibo.weasel.model.property;

import org.edmcouncil.spec.fibo.weasel.model.OwlSimpleProperty;

/**
 * @author Patrycja Miazek (patrycja.miazek@makolab.com)
 */
public class OwlAnnotationIri extends PropertyValueAbstract<OwlSimpleProperty> {

  @Override
  public String toString() {
    return super.getValue().getLabel();
  }
  
}
