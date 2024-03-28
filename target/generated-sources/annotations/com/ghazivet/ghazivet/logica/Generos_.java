package com.ghazivet.ghazivet.logica;

import com.ghazivet.ghazivet.logica.Mascotas;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-03-27T23:19:07", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Generos.class)
public class Generos_ { 

    public static volatile SingularAttribute<Generos, String> descripcion;
    public static volatile ListAttribute<Generos, Mascotas> mascotas;
    public static volatile SingularAttribute<Generos, Integer> id_genero;

}