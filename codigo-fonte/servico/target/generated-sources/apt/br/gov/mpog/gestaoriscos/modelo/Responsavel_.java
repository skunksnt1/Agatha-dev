package br.gov.mpog.gestaoriscos.modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Responsavel.class)
public abstract class Responsavel_ {

	public static volatile SingularAttribute<Responsavel, Boolean> excluido;
	public static volatile SingularAttribute<Responsavel, Processo> processo;
	public static volatile SingularAttribute<Responsavel, Usuario> usuario;
	public static volatile SingularAttribute<Responsavel, Long> id;

}

