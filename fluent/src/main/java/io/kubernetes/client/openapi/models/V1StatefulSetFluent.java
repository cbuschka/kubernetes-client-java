package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1StatefulSetFluent<A extends io.kubernetes.client.openapi.models.V1StatefulSetFluent<A>> extends io.kubernetes.client.fluent.Fluent<A>{
  public java.lang.String getApiVersion();
  public A withApiVersion(java.lang.String apiVersion);
  public java.lang.Boolean hasApiVersion();
  
  /**
   * Method is deprecated. use withApiVersion instead.
   */
  @java.lang.Deprecated
  public A withNewApiVersion(java.lang.String arg0);
  public java.lang.String getKind();
  public A withKind(java.lang.String kind);
  public java.lang.Boolean hasKind();
  
  /**
   * Method is deprecated. use withKind instead.
   */
  @java.lang.Deprecated
  public A withNewKind(java.lang.String arg0);
  
  /**
   * This method has been deprecated, please use method buildMetadata instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1ObjectMeta getMetadata();
  public io.kubernetes.client.openapi.models.V1ObjectMeta buildMetadata();
  public A withMetadata(io.kubernetes.client.openapi.models.V1ObjectMeta metadata);
  public java.lang.Boolean hasMetadata();
  public io.kubernetes.client.openapi.models.V1StatefulSetFluent.MetadataNested<A> withNewMetadata();
  public io.kubernetes.client.openapi.models.V1StatefulSetFluent.MetadataNested<A> withNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);
  public io.kubernetes.client.openapi.models.V1StatefulSetFluent.MetadataNested<A> editMetadata();
  public io.kubernetes.client.openapi.models.V1StatefulSetFluent.MetadataNested<A> editOrNewMetadata();
  public io.kubernetes.client.openapi.models.V1StatefulSetFluent.MetadataNested<A> editOrNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);
  
  /**
   * This method has been deprecated, please use method buildSpec instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1StatefulSetSpec getSpec();
  public io.kubernetes.client.openapi.models.V1StatefulSetSpec buildSpec();
  public A withSpec(io.kubernetes.client.openapi.models.V1StatefulSetSpec spec);
  public java.lang.Boolean hasSpec();
  public io.kubernetes.client.openapi.models.V1StatefulSetFluent.SpecNested<A> withNewSpec();
  public io.kubernetes.client.openapi.models.V1StatefulSetFluent.SpecNested<A> withNewSpecLike(io.kubernetes.client.openapi.models.V1StatefulSetSpec item);
  public io.kubernetes.client.openapi.models.V1StatefulSetFluent.SpecNested<A> editSpec();
  public io.kubernetes.client.openapi.models.V1StatefulSetFluent.SpecNested<A> editOrNewSpec();
  public io.kubernetes.client.openapi.models.V1StatefulSetFluent.SpecNested<A> editOrNewSpecLike(io.kubernetes.client.openapi.models.V1StatefulSetSpec item);
  
  /**
   * This method has been deprecated, please use method buildStatus instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1StatefulSetStatus getStatus();
  public io.kubernetes.client.openapi.models.V1StatefulSetStatus buildStatus();
  public A withStatus(io.kubernetes.client.openapi.models.V1StatefulSetStatus status);
  public java.lang.Boolean hasStatus();
  public io.kubernetes.client.openapi.models.V1StatefulSetFluent.StatusNested<A> withNewStatus();
  public io.kubernetes.client.openapi.models.V1StatefulSetFluent.StatusNested<A> withNewStatusLike(io.kubernetes.client.openapi.models.V1StatefulSetStatus item);
  public io.kubernetes.client.openapi.models.V1StatefulSetFluent.StatusNested<A> editStatus();
  public io.kubernetes.client.openapi.models.V1StatefulSetFluent.StatusNested<A> editOrNewStatus();
  public io.kubernetes.client.openapi.models.V1StatefulSetFluent.StatusNested<A> editOrNewStatusLike(io.kubernetes.client.openapi.models.V1StatefulSetStatus item);
  public interface MetadataNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1ObjectMetaFluent<io.kubernetes.client.openapi.models.V1StatefulSetFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  public interface SpecNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1StatefulSetSpecFluent<io.kubernetes.client.openapi.models.V1StatefulSetFluent.SpecNested<N>>{
    public N and();
    public N endSpec();
    
  }
  public interface StatusNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1StatefulSetStatusFluent<io.kubernetes.client.openapi.models.V1StatefulSetFluent.StatusNested<N>>{
    public N and();
    public N endStatus();
    
  }
  
}