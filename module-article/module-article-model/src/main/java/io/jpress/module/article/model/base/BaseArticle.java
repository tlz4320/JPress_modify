package io.jpress.module.article.model.base;

import io.jboot.db.model.JbootModel;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JPress, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseArticle<M extends BaseArticle<M>> extends JbootModel<M> implements IBean {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
	public void setId(java.lang.Long id) {
		set("id", id);
	}

    /**
     * 主键ID
     */
	public java.lang.Long getId() {
		return getLong("id");
	}

    /**
     * 子版本的文章id
     */
	public void setPid(java.lang.Integer pid) {
		set("pid", pid);
	}

    /**
     * 子版本的文章id
     */
	public java.lang.Integer getPid() {
		return getInt("pid");
	}

    /**
     * slug
     */
	public void setSlug(java.lang.String slug) {
		set("slug", slug);
	}

    /**
     * slug
     */
	public java.lang.String getSlug() {
		return getStr("slug");
	}

    /**
     * 标题
     */
	public void setTitle(java.lang.String title) {
		set("title", title);
	}

    /**
     * 标题
     */
	public java.lang.String getTitle() {
		return getStr("title");
	}

    /**
     * 作者
     */
	public void setAuthor(java.lang.String author) {
		set("author", author);
	}

    /**
     * 作者
     */
	public java.lang.String getAuthor() {
		return getStr("author");
	}

    /**
     * 内容
     */
	public void setContent(java.lang.String content) {
		set("content", content);
	}

    /**
     * 内容
     */
	public java.lang.String getContent() {
		return getStr("content");
	}

    /**
     * 编辑模式，默认为html，其他可选项包括html，markdown ..
     */
	public void setEditMode(java.lang.String editMode) {
		set("edit_mode", editMode);
	}

    /**
     * 编辑模式，默认为html，其他可选项包括html，markdown ..
     */
	public java.lang.String getEditMode() {
		return getStr("edit_mode");
	}

    /**
     * 摘要
     */
	public void setSummary(java.lang.String summary) {
		set("summary", summary);
	}

    /**
     * 摘要
     */
	public java.lang.String getSummary() {
		return getStr("summary");
	}

    /**
     * 连接到(常用于谋文章只是一个连接)
     */
	public void setLinkTo(java.lang.String linkTo) {
		set("link_to", linkTo);
	}

    /**
     * 连接到(常用于谋文章只是一个连接)
     */
	public java.lang.String getLinkTo() {
		return getStr("link_to");
	}

    /**
     * 缩略图
     */
	public void setThumbnail(java.lang.String thumbnail) {
		set("thumbnail", thumbnail);
	}

    /**
     * 缩略图
     */
	public java.lang.String getThumbnail() {
		return getStr("thumbnail");
	}

    /**
     * 样式
     */
	public void setStyle(java.lang.String style) {
		set("style", style);
	}

    /**
     * 样式
     */
	public java.lang.String getStyle() {
		return getStr("style");
	}

    /**
     * 用户ID
     */
	public void setUserId(java.lang.Long userId) {
		set("user_id", userId);
	}

    /**
     * 用户ID
     */
	public java.lang.Long getUserId() {
		return getLong("user_id");
	}

    /**
     * 排序编号
     */
	public void setOrderNumber(java.lang.Integer orderNumber) {
		set("order_number", orderNumber);
	}

    /**
     * 排序编号
     */
	public java.lang.Integer getOrderNumber() {
		return getInt("order_number");
	}

    /**
     * 状态
     */
	public void setStatus(java.lang.String status) {
		set("status", status);
	}

    /**
     * 状态
     */
	public java.lang.String getStatus() {
		return getStr("status");
	}

    /**
     * 评论状态，默认允许评论
     */
	public void setCommentStatus(java.lang.Boolean commentStatus) {
		set("comment_status", commentStatus);
	}

    /**
     * 评论状态，默认允许评论
     */
	public java.lang.Boolean getCommentStatus() {
		return getBoolean("comment_status");
	}

    /**
     * 评论总数
     */
	public void setCommentCount(java.lang.Long commentCount) {
		set("comment_count", commentCount);
	}

    /**
     * 评论总数
     */
	public java.lang.Long getCommentCount() {
		return getLong("comment_count");
	}

    /**
     * 最后评论时间
     */
	public void setCommentTime(java.util.Date commentTime) {
		set("comment_time", commentTime);
	}

    /**
     * 最后评论时间
     */
	public java.util.Date getCommentTime() {
		return getDate("comment_time");
	}

    /**
     * 访问量
     */
	public void setViewCount(java.lang.Long viewCount) {
		set("view_count", viewCount);
	}

    /**
     * 访问量
     */
	public java.lang.Long getViewCount() {
		return getLong("view_count");
	}

    /**
     * 创建日期
     */
	public void setCreated(java.util.Date created) {
		set("created", created);
	}

    /**
     * 创建日期
     */
	public java.util.Date getCreated() {
		return getDate("created");
	}

    /**
     * 最后更新日期
     */
	public void setModified(java.util.Date modified) {
		set("modified", modified);
	}

    /**
     * 最后更新日期
     */
	public java.util.Date getModified() {
		return getDate("modified");
	}

    /**
     * 标识，通常用于对某几篇文章进行标识，从而实现单独查询
     */
	public void setFlag(java.lang.String flag) {
		set("flag", flag);
	}

    /**
     * 标识，通常用于对某几篇文章进行标识，从而实现单独查询
     */
	public java.lang.String getFlag() {
		return getStr("flag");
	}

	/**
	 * SEO标题
	 */
	public void setMetaTitle(java.lang.String metaTitle) {
		set("meta_title", metaTitle);
	}

	/**
	 * SEO标题
	 */
	public java.lang.String getMetaTitle() {
		return getStr("meta_title");
	}

    /**
     * SEO关键字
     */
	public void setMetaKeywords(java.lang.String metaKeywords) {
		set("meta_keywords", metaKeywords);
	}

    /**
     * SEO关键字
     */
	public java.lang.String getMetaKeywords() {
		return getStr("meta_keywords");
	}

    /**
     * SEO描述信息
     */
	public void setMetaDescription(java.lang.String metaDescription) {
		set("meta_description", metaDescription);
	}

    /**
     * SEO描述信息
     */
	public java.lang.String getMetaDescription() {
		return getStr("meta_description");
	}

    /**
     * 是否推荐
     */
	public void setWithRecommend(java.lang.Boolean withRecommend) {
		set("with_recommend", withRecommend);
	}

    /**
     * 是否推荐
     */
	public java.lang.Boolean getWithRecommend() {
		return getBoolean("with_recommend");
	}

    /**
     * 是否置顶
     */
	public void setWithTop(java.lang.Boolean withTop) {
		set("with_top", withTop);
	}

    /**
     * 是否置顶
     */
	public java.lang.Boolean getWithTop() {
		return getBoolean("with_top");
	}

    /**
     * 是否热门
     */
	public void setWithHot(java.lang.Boolean withHot) {
		set("with_hot", withHot);
	}

    /**
     * 是否热门
     */
	public java.lang.Boolean getWithHot() {
		return getBoolean("with_hot");
	}

    /**
     * 是否是头条
     */
	public void setWithLeadNews(java.lang.Boolean withLeadNews) {
		set("with_lead_news", withLeadNews);
	}

    /**
     * 是否是头条
     */
	public java.lang.Boolean getWithLeadNews() {
		return getBoolean("with_lead_news");
	}

    /**
     * 是否允许被搜索
     */
	public void setWithAllowSearch(java.lang.Boolean withAllowSearch) {
		set("with_allow_search", withAllowSearch);
	}

    /**
     * 是否允许被搜索
     */
	public java.lang.Boolean getWithAllowSearch() {
		return getBoolean("with_allow_search");
	}

    /**
     * json 扩展
     */
	public void setOptions(java.lang.String options) {
		set("options", options);
	}

    /**
     * json 扩展
     */
	public java.lang.String getOptions() {
		return getStr("options");
	}

    /**
     * 站点ID
     */
	public void setSiteId(java.lang.Long siteId) {
		set("site_id", siteId);
	}

    /**
     * 站点ID
     */
	public java.lang.Long getSiteId() {
		return getLong("site_id");
	}

}
