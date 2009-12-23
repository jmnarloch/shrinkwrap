/*
 * JBoss, Home of Professional Open Source
 * Copyright 2009, Red Hat Middleware LLC, and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.shrinkwrap.api.container;

import java.io.File;
import java.net.URL;

import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.Asset;
import org.jboss.shrinkwrap.api.Path;

/**
 * ManifestContainer
 * 
 * Defines the contract for a component capable of storing 
 * Manifest related resources.
 * <br/><br/>
 * The actual path to the Manifest resources within the {@link Archive} 
 * is up to the implementations/specifications.
 *
 * @author <a href="mailto:aslak@conduct.no">Aslak Knutsen</a>
 * @version $Revision: $
 * @param <T>
 */
public interface ManifestContainer<T extends Archive<T>>
{
   //-------------------------------------------------------------------------------------||
   // Contracts --------------------------------------------------------------------------||
   //-------------------------------------------------------------------------------------||

   /**
    * Adds the resource as MANIFEST.FM to the container, returning the container itself.
    * <br/>
    * The {@link ClassLoader} used to obtain the resource is up to the implementation.  
    * 
    * @param resourceName resource to add
    * @return This virtual archive
    * @throws IllegalArgumentException if resourceName is null
    * @see #setManifest(Asset)
    */
   T setManifest(String resourceName) throws IllegalArgumentException;
   
   /**
    * Adds the {@link File} as MANIFEST.FM to the container, returning the container itself.
    * 
    * @param resource {@link File} resource to add
    * @return This virtual archive
    * @throws IllegalArgumentException if resource is null
    * @see #setManifest(Asset)
    */
   T setManifest(File resource) throws IllegalArgumentException;

   /**
    * Adds the {@link URL} as MANIFEST.FM to the container, returning the container itself.
    * 
    * @param resource {@link URL} resource to add
    * @return This virtual archive
    * @throws IllegalArgumentException if resource is null
    * @see #setManifest(Asset)
    */
   T setManifest(URL resource) throws IllegalArgumentException;
   
   /**
    * Adds the {@link Asset} as MANIFEST.FM to the container, returning the container itself.
    * 
    * @param resource {@link File} resource to add
    * @return This virtual archive
    * @throws IllegalArgumentException if resource is null
    * @see #addManifestResource(Asset, Path)
    */
   T setManifest(Asset resource) throws IllegalArgumentException;
   
   /**
    * Adds the resource as a Manifest resource to the container, returning the container itself.
    * <br/>
    * The resource will be placed into the Container Manifest path under the same context 
    * from which it was retrieved.
    * <br/><br/>
    * The {@link ClassLoader} used to obtain the resource is up to the implementation.  
    * 
    * @param resourceName resource to add
    * @return This virtual archive
    * @throws IllegalArgumentException if resourceName is null
    * @throws IllegalArgumentException if target is null
    * @see #addManifestResource(Asset, Path)
    */
   T addManifestResource(String resourceName) throws IllegalArgumentException;
   
   /**
    * Adds the {@link File} as a Manifest resource to the container, returning the container itself.
    * <br/>
    * The {@link File} will be placed into the Container Manifest path under {@link File#getName()}. 
    * 
    * @param resource resource to add
    * @return This virtual archive
    * @throws IllegalArgumentException if {@link File} resource is null
    * @throws IllegalArgumentException if target is null
    * @see #addManifestResource(Asset, Path)
    */
   T addManifestResource(File resource) throws IllegalArgumentException;

   /**
    * Adds the resource as a Manifest resource to the container, returning the container itself.
    * <br/>
    * The {@link ClassLoader} used to obtain the resource is up to the implementation.  
    * 
    * @param resourceName resource to add
    * @param target The target path within the archive in which to add the resource, relative to the {@link Archive}s manifest path.
    * @return This virtual archive
    * @throws IllegalArgumentException if resourceName is null
    * @throws IllegalArgumentException if target is null
    * @see #addManifestResource(Asset, Path)
    */
   T addManifestResource(String resourceName, String target) throws IllegalArgumentException;

   /**
    * Adds the {@link File} as a Manifest resource to the container, returning the container itself.
    * 
    * @param resource {@link File} resource to add
    * @param target The target path within the archive in which to add the resource, relative to the {@link Archive}s manifest path.
    * @return This virtual archive
    * @throws IllegalArgumentException if resource is null
    * @throws IllegalArgumentException if target is null
    * @see #addManifestResource(Asset, Path)
    */
   T addManifestResource(File resource, String target) throws IllegalArgumentException;

   /**
    * Adds the {@link URL} as a Manifest resource to the container, returning the container itself.
    * 
    * @param resource {@link URL} resource to add
    * @param target The target path within the archive in which to add the resource, relative to the {@link Archive}s manifest path.
    * @return This virtual archive
    * @throws IllegalArgumentException if resource is null
    * @throws IllegalArgumentException if target is null
    * @see #addManifestResource(Asset, Path)
    */
   T addManifestResource(URL resource, String target) throws IllegalArgumentException;

   /**
    * Adds the {@link Asset} as a Manifest resource to the container, returning the container itself.
    * 
    * @param resource {@link Asset} resource to add
    * @param target The target path within the archive in which to add the resource, relative to the {@link Archive}s manifest path.
    * @return This virtual archive
    * @throws IllegalArgumentException if resource is null
    * @throws IllegalArgumentException if target is null
    * @see #addManifestResource(Asset, Path)
    */
   T addManifestResource(Asset resource, String target) throws IllegalArgumentException;

   /**
    * Adds the resource as a Manifest resource to the container, returning the container itself.
    * <br/>
    * The {@link ClassLoader} used to obtain the resource is up to the implementation.  
    * 
    * @param resourceName resource to add
    * @param target The target path within the archive in which to add the resource, relative to the {@link Archive}s manifest path.
    * @return This virtual archive
    * @throws IllegalArgumentException if resourceName is null
    * @throws IllegalArgumentException if target is null
    * @see #addManifestResource(Asset, Path)
    */
   T addManifestResource(String resourceName, Path target) throws IllegalArgumentException;

   /**
    * Adds the {@link File} as a Manifest resource to the container, returning the container itself.
    * 
    * @param resource {@link File} resource to add
    * @param target The target path within the archive in which to add the resource, relative to the {@link Archive}s manifest path.
    * @return This virtual archive
    * @throws IllegalArgumentException if resource is null
    * @throws IllegalArgumentException if target is null
    * @see #addManifestResource(Asset, Path)
    */
   T addManifestResource(File resource, Path target) throws IllegalArgumentException;
   
   /**
    * Adds the {@link URL} as a Manifest resource to the container, returning the container itself.
    * 
    * @param resource {@link URL} resource to add
    * @param target The target path within the archive in which to add the resource, relative to the {@link Archive}s manifest path.
    * @return This virtual archive
    * @throws IllegalArgumentException if resource is null
    * @throws IllegalArgumentException if target is null
    * @see #addManifestResource(Asset, Path)
    */
   T addManifestResource(URL resource, Path target) throws IllegalArgumentException;

   /**
    * Adds the {@link Asset} as a Manifest resource to the container, returning the container itself.
    * 
    * @param resource {@link Asset} resource to add
    * @param target The target path within the archive in which to add the resource, relative to the {@link Archive}s manifest path.
    * @return This virtual archive
    * @throws IllegalArgumentException if resource is null
    * @throws IllegalArgumentException if target is null
    */
   T addManifestResource(Asset resource, Path target) throws IllegalArgumentException;
   
   /**
    * Adds a META-INF/services/ServiceInterfaceName {@link Asset} representing this service.
    * 
    * Warning: this method does not add the specified classes to the archive. 
    * 
    * @param serviceInterface The Service Interface class
    * @param serviceImpls The Service Interface Implementations
    * @return This virtual archive
    * @throws IllegalArgumentException if serviceInterface is null
    * @throws IllegalArgumentException if serviceImpls is null or contain null values
    */
   /*
    * TODO: The interface should have been like this:
    * <X> T addServiceProvider(Class<X> serviceInterface, Class<? extends X>... serviceImpls) throws IllegalArgumentException;
    * But due to how java generic works, this will cause a unsafe warning for the user. 
    */
   T addServiceProvider(Class<?> serviceInterface, Class<?>... serviceImpls) throws IllegalArgumentException;
}
