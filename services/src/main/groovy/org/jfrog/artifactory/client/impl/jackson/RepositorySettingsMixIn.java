package org.jfrog.artifactory.client.impl.jackson;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.jfrog.artifactory.client.model.repository.settings.RepositorySettings;
import org.jfrog.artifactory.client.model.repository.settings.impl.*;

/**
 * special serialization / deserialization handling for {@link RepositorySettings}
 * 
 * @author Ivan Vasylivskyi (ivanvas@jfrog.com)
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "packageType", defaultImpl = GenericRepositorySettingsImpl.class)
@JsonSubTypes({
    @JsonSubTypes.Type(value = BowerRepositorySettingsImpl.class, name = "bower"),
    @JsonSubTypes.Type(value = CocoaPodsRepositorySettingsImpl.class, name = "cocoapods"),
    @JsonSubTypes.Type(value = DebianRepositorySettingsImpl.class, name = "debian"),
    @JsonSubTypes.Type(value = DockerRepositorySettingsImpl.class, name = "docker"),
    @JsonSubTypes.Type(value = GemsRepositorySettingsImpl.class, name = "gems"),
    @JsonSubTypes.Type(value = GenericRepositorySettingsImpl.class, name = "generic"),
    @JsonSubTypes.Type(value = GitLfsRepositorySettingsImpl.class, name = "gitlfs"),
    @JsonSubTypes.Type(value = GradleRepositorySettingsImpl.class, name = "gradle"),
    @JsonSubTypes.Type(value = IvyRepositorySettingsImpl.class, name = "ivy"),
    @JsonSubTypes.Type(value = MavenRepositorySettingsImpl.class, name = "maven"),
    @JsonSubTypes.Type(value = NpmRepositorySettingsImpl.class, name = "npm"),
    @JsonSubTypes.Type(value = NugetRepositorySettingsImpl.class, name = "nuget"),
    @JsonSubTypes.Type(value = OpkgRepositorySettingsImpl.class, name = "opkg"),
    @JsonSubTypes.Type(value = P2RepositorySettingsImpl.class, name = "p2"),
    @JsonSubTypes.Type(value = PypiRepositorySettingsImpl.class, name = "pypi"),
    @JsonSubTypes.Type(value = SbtRepositorySettingsImpl.class, name = "sbt"),
    @JsonSubTypes.Type(value = VagrantRepositorySettingsImpl.class, name = "vagrant"),
    @JsonSubTypes.Type(value = VcsRepositorySettingsImpl.class, name = "vcs"),
    @JsonSubTypes.Type(value = YumRepositorySettingsImpl.class, name = "yum")
})
public interface RepositorySettingsMixIn {

}
