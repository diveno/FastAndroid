package com.diveno.fastandroid.data.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Diego on 15/06/2016.
 */
public class Repo {

    /**
     * id : 417862
     * name : octokit.rb
     * full_name : octokit/octokit.rb
     * owner : {"login":"octokit","id":3430433,"avatar_url":"https://avatars.githubusercontent.com/u/3430433?v=3","gravatar_id":"","url":"https://api.github.com/users/octokit","html_url":"https://github.com/octokit","followers_url":"https://api.github.com/users/octokit/followers","following_url":"https://api.github.com/users/octokit/following{/other_user}","gists_url":"https://api.github.com/users/octokit/gists{/gist_id}","starred_url":"https://api.github.com/users/octokit/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/octokit/subscriptions","organizations_url":"https://api.github.com/users/octokit/orgs","repos_url":"https://api.github.com/users/octokit/repos","events_url":"https://api.github.com/users/octokit/events{/privacy}","received_events_url":"https://api.github.com/users/octokit/received_events","type":"Organization","site_admin":false}
     * private : false
     * html_url : https://github.com/octokit/octokit.rb
     * description : Ruby toolkit for the GitHub API
     * fork : false
     * url : https://api.github.com/repos/octokit/octokit.rb
     * forks_url : https://api.github.com/repos/octokit/octokit.rb/forks
     * keys_url : https://api.github.com/repos/octokit/octokit.rb/keys{/key_id}
     * collaborators_url : https://api.github.com/repos/octokit/octokit.rb/collaborators{/collaborator}
     * teams_url : https://api.github.com/repos/octokit/octokit.rb/teams
     * hooks_url : https://api.github.com/repos/octokit/octokit.rb/hooks
     * issue_events_url : https://api.github.com/repos/octokit/octokit.rb/issues/events{/number}
     * events_url : https://api.github.com/repos/octokit/octokit.rb/events
     * assignees_url : https://api.github.com/repos/octokit/octokit.rb/assignees{/user}
     * branches_url : https://api.github.com/repos/octokit/octokit.rb/branches{/branch}
     * tags_url : https://api.github.com/repos/octokit/octokit.rb/tags
     * blobs_url : https://api.github.com/repos/octokit/octokit.rb/git/blobs{/sha}
     * git_tags_url : https://api.github.com/repos/octokit/octokit.rb/git/tags{/sha}
     * git_refs_url : https://api.github.com/repos/octokit/octokit.rb/git/refs{/sha}
     * trees_url : https://api.github.com/repos/octokit/octokit.rb/git/trees{/sha}
     * statuses_url : https://api.github.com/repos/octokit/octokit.rb/statuses/{sha}
     * languages_url : https://api.github.com/repos/octokit/octokit.rb/languages
     * stargazers_url : https://api.github.com/repos/octokit/octokit.rb/stargazers
     * contributors_url : https://api.github.com/repos/octokit/octokit.rb/contributors
     * subscribers_url : https://api.github.com/repos/octokit/octokit.rb/subscribers
     * subscription_url : https://api.github.com/repos/octokit/octokit.rb/subscription
     * commits_url : https://api.github.com/repos/octokit/octokit.rb/commits{/sha}
     * git_commits_url : https://api.github.com/repos/octokit/octokit.rb/git/commits{/sha}
     * comments_url : https://api.github.com/repos/octokit/octokit.rb/comments{/number}
     * issue_comment_url : https://api.github.com/repos/octokit/octokit.rb/issues/comments{/number}
     * contents_url : https://api.github.com/repos/octokit/octokit.rb/contents/{+path}
     * compare_url : https://api.github.com/repos/octokit/octokit.rb/compare/{base}...{head}
     * merges_url : https://api.github.com/repos/octokit/octokit.rb/merges
     * archive_url : https://api.github.com/repos/octokit/octokit.rb/{archive_format}{/ref}
     * downloads_url : https://api.github.com/repos/octokit/octokit.rb/downloads
     * issues_url : https://api.github.com/repos/octokit/octokit.rb/issues{/number}
     * pulls_url : https://api.github.com/repos/octokit/octokit.rb/pulls{/number}
     * milestones_url : https://api.github.com/repos/octokit/octokit.rb/milestones{/number}
     * notifications_url : https://api.github.com/repos/octokit/octokit.rb/notifications{?since,all,participating}
     * labels_url : https://api.github.com/repos/octokit/octokit.rb/labels{/name}
     * releases_url : https://api.github.com/repos/octokit/octokit.rb/releases{/id}
     * deployments_url : https://api.github.com/repos/octokit/octokit.rb/deployments
     * created_at : 2009-12-10T21:41:49Z
     * updated_at : 2016-06-14T19:35:06Z
     * pushed_at : 2016-05-30T07:00:34Z
     * git_url : git://github.com/octokit/octokit.rb.git
     * ssh_url : git@github.com:octokit/octokit.rb.git
     * clone_url : https://github.com/octokit/octokit.rb.git
     * svn_url : https://github.com/octokit/octokit.rb
     * homepage : http://octokit.github.io/octokit.rb/
     * size : 14308
     * stargazers_count : 2268
     * watchers_count : 2268
     * language : Ruby
     * has_issues : true
     * has_downloads : true
     * has_wiki : false
     * has_pages : true
     * forks_count : 575
     * mirror_url : null
     * open_issues_count : 30
     * forks : 575
     * open_issues : 30
     * watchers : 2268
     * default_branch : master
     * permissions : {"admin":false,"push":false,"pull":true}
     */

    @SerializedName("id")
    private int id;
    @SerializedName("name")
    private String name;
    @SerializedName("full_name")
    private String fullName;
    /**
     * login : octokit
     * id : 3430433
     * avatar_url : https://avatars.githubusercontent.com/u/3430433?v=3
     * gravatar_id :
     * url : https://api.github.com/users/octokit
     * html_url : https://github.com/octokit
     * followers_url : https://api.github.com/users/octokit/followers
     * following_url : https://api.github.com/users/octokit/following{/other_user}
     * gists_url : https://api.github.com/users/octokit/gists{/gist_id}
     * starred_url : https://api.github.com/users/octokit/starred{/owner}{/repo}
     * subscriptions_url : https://api.github.com/users/octokit/subscriptions
     * organizations_url : https://api.github.com/users/octokit/orgs
     * repos_url : https://api.github.com/users/octokit/repos
     * events_url : https://api.github.com/users/octokit/events{/privacy}
     * received_events_url : https://api.github.com/users/octokit/received_events
     * type : Organization
     * site_admin : false
     */

    @SerializedName("owner")
    private Owner owner;
    @SerializedName("private")
    private boolean privateX;
    @SerializedName("html_url")
    private String htmlUrl;
    @SerializedName("description")
    private String description;
    @SerializedName("fork")
    private boolean fork;
    @SerializedName("url")
    private String url;
    @SerializedName("forks_url")
    private String forksUrl;
    @SerializedName("keys_url")
    private String keysUrl;
    @SerializedName("collaborators_url")
    private String collaboratorsUrl;
    @SerializedName("teams_url")
    private String teamsUrl;
    @SerializedName("hooks_url")
    private String hooksUrl;
    @SerializedName("issue_events_url")
    private String issueEventsUrl;
    @SerializedName("events_url")
    private String eventsUrl;
    @SerializedName("assignees_url")
    private String assigneesUrl;
    @SerializedName("branches_url")
    private String branchesUrl;
    @SerializedName("tags_url")
    private String tagsUrl;
    @SerializedName("blobs_url")
    private String blobsUrl;
    @SerializedName("git_tags_url")
    private String gitTagsUrl;
    @SerializedName("git_refs_url")
    private String gitRefsUrl;
    @SerializedName("trees_url")
    private String treesUrl;
    @SerializedName("statuses_url")
    private String statusesUrl;
    @SerializedName("languages_url")
    private String languagesUrl;
    @SerializedName("stargazers_url")
    private String stargazersUrl;
    @SerializedName("contributors_url")
    private String contributorsUrl;
    @SerializedName("subscribers_url")
    private String subscribersUrl;
    @SerializedName("subscription_url")
    private String subscriptionUrl;
    @SerializedName("commits_url")
    private String commitsUrl;
    @SerializedName("git_commits_url")
    private String gitCommitsUrl;
    @SerializedName("comments_url")
    private String commentsUrl;
    @SerializedName("issue_comment_url")
    private String issueCommentUrl;
    @SerializedName("contents_url")
    private String contentsUrl;
    @SerializedName("compare_url")
    private String compareUrl;
    @SerializedName("merges_url")
    private String mergesUrl;
    @SerializedName("archive_url")
    private String archiveUrl;
    @SerializedName("downloads_url")
    private String downloadsUrl;
    @SerializedName("issues_url")
    private String issuesUrl;
    @SerializedName("pulls_url")
    private String pullsUrl;
    @SerializedName("milestones_url")
    private String milestonesUrl;
    @SerializedName("notifications_url")
    private String notificationsUrl;
    @SerializedName("labels_url")
    private String labelsUrl;
    @SerializedName("releases_url")
    private String releasesUrl;
    @SerializedName("deployments_url")
    private String deploymentsUrl;
    @SerializedName("created_at")
    private String createdAt;
    @SerializedName("updated_at")
    private String updatedAt;
    @SerializedName("pushed_at")
    private String pushedAt;
    @SerializedName("git_url")
    private String gitUrl;
    @SerializedName("ssh_url")
    private String sshUrl;
    @SerializedName("clone_url")
    private String cloneUrl;
    @SerializedName("svn_url")
    private String svnUrl;
    @SerializedName("homepage")
    private String homepage;
    @SerializedName("size")
    private int size;
    @SerializedName("stargazers_count")
    private int stargazersCount;
    @SerializedName("watchers_count")
    private int watchersCount;
    @SerializedName("language")
    private String language;
    @SerializedName("has_issues")
    private boolean hasIssues;
    @SerializedName("has_downloads")
    private boolean hasDownloads;
    @SerializedName("has_wiki")
    private boolean hasWiki;
    @SerializedName("has_pages")
    private boolean hasPages;
    @SerializedName("forks_count")
    private int forksCount;
    @SerializedName("mirror_url")
    private String mirrorUrl;
    @SerializedName("open_issues_count")
    private int openIssuesCount;
    @SerializedName("forks")
    private int forks;
    @SerializedName("open_issues")
    private int openIssues;
    @SerializedName("watchers")
    private int watchers;
    @SerializedName("default_branch")
    private String defaultBranch;
    /**
     * admin : false
     * push : false
     * pull : true
     */

    @SerializedName("permissions")
    private Permissions permissions;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public boolean isPrivateX() {
        return privateX;
    }

    public void setPrivateX(boolean privateX) {
        this.privateX = privateX;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isFork() {
        return fork;
    }

    public void setFork(boolean fork) {
        this.fork = fork;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getForksUrl() {
        return forksUrl;
    }

    public void setForksUrl(String forksUrl) {
        this.forksUrl = forksUrl;
    }

    public String getKeysUrl() {
        return keysUrl;
    }

    public void setKeysUrl(String keysUrl) {
        this.keysUrl = keysUrl;
    }

    public String getCollaboratorsUrl() {
        return collaboratorsUrl;
    }

    public void setCollaboratorsUrl(String collaboratorsUrl) {
        this.collaboratorsUrl = collaboratorsUrl;
    }

    public String getTeamsUrl() {
        return teamsUrl;
    }

    public void setTeamsUrl(String teamsUrl) {
        this.teamsUrl = teamsUrl;
    }

    public String getHooksUrl() {
        return hooksUrl;
    }

    public void setHooksUrl(String hooksUrl) {
        this.hooksUrl = hooksUrl;
    }

    public String getIssueEventsUrl() {
        return issueEventsUrl;
    }

    public void setIssueEventsUrl(String issueEventsUrl) {
        this.issueEventsUrl = issueEventsUrl;
    }

    public String getEventsUrl() {
        return eventsUrl;
    }

    public void setEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
    }

    public String getAssigneesUrl() {
        return assigneesUrl;
    }

    public void setAssigneesUrl(String assigneesUrl) {
        this.assigneesUrl = assigneesUrl;
    }

    public String getBranchesUrl() {
        return branchesUrl;
    }

    public void setBranchesUrl(String branchesUrl) {
        this.branchesUrl = branchesUrl;
    }

    public String getTagsUrl() {
        return tagsUrl;
    }

    public void setTagsUrl(String tagsUrl) {
        this.tagsUrl = tagsUrl;
    }

    public String getBlobsUrl() {
        return blobsUrl;
    }

    public void setBlobsUrl(String blobsUrl) {
        this.blobsUrl = blobsUrl;
    }

    public String getGitTagsUrl() {
        return gitTagsUrl;
    }

    public void setGitTagsUrl(String gitTagsUrl) {
        this.gitTagsUrl = gitTagsUrl;
    }

    public String getGitRefsUrl() {
        return gitRefsUrl;
    }

    public void setGitRefsUrl(String gitRefsUrl) {
        this.gitRefsUrl = gitRefsUrl;
    }

    public String getTreesUrl() {
        return treesUrl;
    }

    public void setTreesUrl(String treesUrl) {
        this.treesUrl = treesUrl;
    }

    public String getStatusesUrl() {
        return statusesUrl;
    }

    public void setStatusesUrl(String statusesUrl) {
        this.statusesUrl = statusesUrl;
    }

    public String getLanguagesUrl() {
        return languagesUrl;
    }

    public void setLanguagesUrl(String languagesUrl) {
        this.languagesUrl = languagesUrl;
    }

    public String getStargazersUrl() {
        return stargazersUrl;
    }

    public void setStargazersUrl(String stargazersUrl) {
        this.stargazersUrl = stargazersUrl;
    }

    public String getContributorsUrl() {
        return contributorsUrl;
    }

    public void setContributorsUrl(String contributorsUrl) {
        this.contributorsUrl = contributorsUrl;
    }

    public String getSubscribersUrl() {
        return subscribersUrl;
    }

    public void setSubscribersUrl(String subscribersUrl) {
        this.subscribersUrl = subscribersUrl;
    }

    public String getSubscriptionUrl() {
        return subscriptionUrl;
    }

    public void setSubscriptionUrl(String subscriptionUrl) {
        this.subscriptionUrl = subscriptionUrl;
    }

    public String getCommitsUrl() {
        return commitsUrl;
    }

    public void setCommitsUrl(String commitsUrl) {
        this.commitsUrl = commitsUrl;
    }

    public String getGitCommitsUrl() {
        return gitCommitsUrl;
    }

    public void setGitCommitsUrl(String gitCommitsUrl) {
        this.gitCommitsUrl = gitCommitsUrl;
    }

    public String getCommentsUrl() {
        return commentsUrl;
    }

    public void setCommentsUrl(String commentsUrl) {
        this.commentsUrl = commentsUrl;
    }

    public String getIssueCommentUrl() {
        return issueCommentUrl;
    }

    public void setIssueCommentUrl(String issueCommentUrl) {
        this.issueCommentUrl = issueCommentUrl;
    }

    public String getContentsUrl() {
        return contentsUrl;
    }

    public void setContentsUrl(String contentsUrl) {
        this.contentsUrl = contentsUrl;
    }

    public String getCompareUrl() {
        return compareUrl;
    }

    public void setCompareUrl(String compareUrl) {
        this.compareUrl = compareUrl;
    }

    public String getMergesUrl() {
        return mergesUrl;
    }

    public void setMergesUrl(String mergesUrl) {
        this.mergesUrl = mergesUrl;
    }

    public String getArchiveUrl() {
        return archiveUrl;
    }

    public void setArchiveUrl(String archiveUrl) {
        this.archiveUrl = archiveUrl;
    }

    public String getDownloadsUrl() {
        return downloadsUrl;
    }

    public void setDownloadsUrl(String downloadsUrl) {
        this.downloadsUrl = downloadsUrl;
    }

    public String getIssuesUrl() {
        return issuesUrl;
    }

    public void setIssuesUrl(String issuesUrl) {
        this.issuesUrl = issuesUrl;
    }

    public String getPullsUrl() {
        return pullsUrl;
    }

    public void setPullsUrl(String pullsUrl) {
        this.pullsUrl = pullsUrl;
    }

    public String getMilestonesUrl() {
        return milestonesUrl;
    }

    public void setMilestonesUrl(String milestonesUrl) {
        this.milestonesUrl = milestonesUrl;
    }

    public String getNotificationsUrl() {
        return notificationsUrl;
    }

    public void setNotificationsUrl(String notificationsUrl) {
        this.notificationsUrl = notificationsUrl;
    }

    public String getLabelsUrl() {
        return labelsUrl;
    }

    public void setLabelsUrl(String labelsUrl) {
        this.labelsUrl = labelsUrl;
    }

    public String getReleasesUrl() {
        return releasesUrl;
    }

    public void setReleasesUrl(String releasesUrl) {
        this.releasesUrl = releasesUrl;
    }

    public String getDeploymentsUrl() {
        return deploymentsUrl;
    }

    public void setDeploymentsUrl(String deploymentsUrl) {
        this.deploymentsUrl = deploymentsUrl;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getPushedAt() {
        return pushedAt;
    }

    public void setPushedAt(String pushedAt) {
        this.pushedAt = pushedAt;
    }

    public String getGitUrl() {
        return gitUrl;
    }

    public void setGitUrl(String gitUrl) {
        this.gitUrl = gitUrl;
    }

    public String getSshUrl() {
        return sshUrl;
    }

    public void setSshUrl(String sshUrl) {
        this.sshUrl = sshUrl;
    }

    public String getCloneUrl() {
        return cloneUrl;
    }

    public void setCloneUrl(String cloneUrl) {
        this.cloneUrl = cloneUrl;
    }

    public String getSvnUrl() {
        return svnUrl;
    }

    public void setSvnUrl(String svnUrl) {
        this.svnUrl = svnUrl;
    }

    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getStargazersCount() {
        return stargazersCount;
    }

    public void setStargazersCount(int stargazersCount) {
        this.stargazersCount = stargazersCount;
    }

    public int getWatchersCount() {
        return watchersCount;
    }

    public void setWatchersCount(int watchersCount) {
        this.watchersCount = watchersCount;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public boolean isHasIssues() {
        return hasIssues;
    }

    public void setHasIssues(boolean hasIssues) {
        this.hasIssues = hasIssues;
    }

    public boolean isHasDownloads() {
        return hasDownloads;
    }

    public void setHasDownloads(boolean hasDownloads) {
        this.hasDownloads = hasDownloads;
    }

    public boolean isHasWiki() {
        return hasWiki;
    }

    public void setHasWiki(boolean hasWiki) {
        this.hasWiki = hasWiki;
    }

    public boolean isHasPages() {
        return hasPages;
    }

    public void setHasPages(boolean hasPages) {
        this.hasPages = hasPages;
    }

    public int getForksCount() {
        return forksCount;
    }

    public void setForksCount(int forksCount) {
        this.forksCount = forksCount;
    }

    public String getMirrorUrl() {
        return mirrorUrl;
    }

    public void setMirrorUrl(String mirrorUrl) {
        this.mirrorUrl = mirrorUrl;
    }

    public int getOpenIssuesCount() {
        return openIssuesCount;
    }

    public void setOpenIssuesCount(int openIssuesCount) {
        this.openIssuesCount = openIssuesCount;
    }

    public int getForks() {
        return forks;
    }

    public void setForks(int forks) {
        this.forks = forks;
    }

    public int getOpenIssues() {
        return openIssues;
    }

    public void setOpenIssues(int openIssues) {
        this.openIssues = openIssues;
    }

    public int getWatchers() {
        return watchers;
    }

    public void setWatchers(int watchers) {
        this.watchers = watchers;
    }

    public String getDefaultBranch() {
        return defaultBranch;
    }

    public void setDefaultBranch(String defaultBranch) {
        this.defaultBranch = defaultBranch;
    }

    public Permissions getPermissions() {
        return permissions;
    }

    public void setPermissions(Permissions permissions) {
        this.permissions = permissions;
    }
}
