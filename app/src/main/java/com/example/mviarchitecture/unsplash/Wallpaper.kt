package com.example.mviarchitecture.unsplash

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Wallpaper(

	@field:SerializedName("total")
	val total: Int? = null,

	@field:SerializedName("total_pages")
	val totalPages: Int? = null,

	@field:SerializedName("results")
	val results: List<ResultsItem?>? = null
)

data class Urls(

	@field:SerializedName("small")
	val small: String? = null,

	@field:SerializedName("small_s3")
	val smallS3: String? = null,

	@field:SerializedName("thumb")
	val thumb: String? = null,

	@field:SerializedName("raw")
	val raw: String? = null,

	@field:SerializedName("regular")
	val regular: String? = null,

	@field:SerializedName("full")
	val full: String? = null
)

data class Social(

	@field:SerializedName("twitter_username")
	val twitterUsername: Any? = null,

	@field:SerializedName("paypal_email")
	val paypalEmail: Any? = null,

	@field:SerializedName("instagram_username")
	val instagramUsername: Any? = null,

	@field:SerializedName("portfolio_url")
	val portfolioUrl: String? = null
)

data class ProfileImage(

	@field:SerializedName("small")
	val small: String? = null,

	@field:SerializedName("large")
	val large: String? = null,

	@field:SerializedName("medium")
	val medium: String? = null
)

data class TexturesPatterns(

	@field:SerializedName("approved_on")
	val approvedOn: String? = null,

	@field:SerializedName("status")
	val status: String? = null
)

data class FoodDrink(

	@field:SerializedName("status")
	val status: String? = null,

	@field:SerializedName("approved_on")
	val approvedOn: String? = null
)

data class BusinessWork(

	@field:SerializedName("approved_on")
	val approvedOn: String? = null,

	@field:SerializedName("status")
	val status: String? = null
)

data class TagsItem(

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("title")
	val title: String? = null,

	@field:SerializedName("source")
	val source: Source? = null
)

data class TopicSubmissions(

	@field:SerializedName("wallpapers")
	val wallpapers: Wallpapers? = null,

	@field:SerializedName("color-of-water")
	val colorOfWater: ColorOfWater? = null,

	@field:SerializedName("textures-patterns")
	val texturesPatterns: TexturesPatterns? = null,

	@field:SerializedName("experimental")
	val experimental: Experimental? = null,

	@field:SerializedName("health")
	val health: Health? = null,

	@field:SerializedName("business-work")
	val businessWork: BusinessWork? = null,

	@field:SerializedName("work-from-home")
	val workFromHome: WorkFromHome? = null,

	@field:SerializedName("technology")
	val technology: Technology? = null,

	@field:SerializedName("food-drink")
	val foodDrink: FoodDrink? = null,

	@field:SerializedName("arts-culture")
	val artsCulture: ArtsCulture? = null,

	@field:SerializedName("architecture-interior")
	val architectureInterior: ArchitectureInterior? = null,

	@field:SerializedName("nature")
	val nature: Nature? = null,

	@field:SerializedName("spirituality")
	val spirituality: Spirituality? = null,

	@field:SerializedName("fashion-beauty")
	val fashionBeauty: FashionBeauty? = null,

	@field:SerializedName("people")
	val people: People? = null,

	@field:SerializedName("current-events")
	val currentEvents: CurrentEvents? = null,

	@field:SerializedName("monochrome")
	val monochrome: Monochrome? = null
)

data class Source(

	@field:SerializedName("meta_description")
	val metaDescription: String? = null,

	@field:SerializedName("ancestry")
	val ancestry: Ancestry? = null,

	@field:SerializedName("cover_photo")
	val coverPhoto: CoverPhoto? = null,

	@field:SerializedName("meta_title")
	val metaTitle: String? = null,

	@field:SerializedName("subtitle")
	val subtitle: String? = null,

	@field:SerializedName("description")
	val description: String? = null,

	@field:SerializedName("title")
	val title: String? = null
)

data class ResultsItem(

	@field:SerializedName("featured")
	val featured: Boolean? = null,

	@field:SerializedName("private")
	val jsonMemberPrivate: Boolean? = null,

	@field:SerializedName("cover_photo")
	val coverPhoto: CoverPhoto? = null,

	@field:SerializedName("total_photos")
	val totalPhotos: Int? = null,

	@field:SerializedName("share_key")
	val shareKey: String? = null,

	@field:SerializedName("description")
	val description: Any? = null,

	@field:SerializedName("title")
	val title: String? = null,

	@field:SerializedName("tags")
	val tags: List<TagsItem?>? = null,

	@field:SerializedName("preview_photos")
	val previewPhotos: List<PreviewPhotosItem?>? = null,

	@field:SerializedName("updated_at")
	val updatedAt: String? = null,

	@field:SerializedName("curated")
	val curated: Boolean? = null,

	@field:SerializedName("last_collected_at")
	val lastCollectedAt: String? = null,

	@field:SerializedName("links")
	val links: Links? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("published_at")
	val publishedAt: String? = null,

	@field:SerializedName("user")
	val user: User? = null
)

data class Links(

	@field:SerializedName("followers")
	val followers: String? = null,

	@field:SerializedName("portfolio")
	val portfolio: String? = null,

	@field:SerializedName("following")
	val following: String? = null,

	@field:SerializedName("self")
	val self: String? = null,

	@field:SerializedName("html")
	val html: String? = null,

	@field:SerializedName("photos")
	val photos: String? = null,

	@field:SerializedName("likes")
	val likes: String? = null,

	@field:SerializedName("related")
	val related: String? = null,

	@field:SerializedName("download")
	val download: String? = null,

	@field:SerializedName("download_location")
	val downloadLocation: String? = null
)

data class Health(

	@field:SerializedName("approved_on")
	val approvedOn: String? = null,

	@field:SerializedName("status")
	val status: String? = null
)

data class User(

	@field:SerializedName("total_photos")
	val totalPhotos: Int? = null,

	@field:SerializedName("accepted_tos")
	val acceptedTos: Boolean? = null,

	@field:SerializedName("social")
	val social: Social? = null,

	@field:SerializedName("twitter_username")
	val twitterUsername: Any? = null,

	@field:SerializedName("last_name")
	val lastName: Any? = null,

	@field:SerializedName("bio")
	val bio: String? = null,

	@field:SerializedName("total_likes")
	val totalLikes: Int? = null,

	@field:SerializedName("portfolio_url")
	val portfolioUrl: String? = null,

	@field:SerializedName("profile_image")
	val profileImage: ProfileImage? = null,

	@field:SerializedName("updated_at")
	val updatedAt: String? = null,

	@field:SerializedName("for_hire")
	val forHire: Boolean? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("location")
	val location: String? = null,

	@field:SerializedName("links")
	val links: Links? = null,

	@field:SerializedName("total_collections")
	val totalCollections: Int? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("first_name")
	val firstName: String? = null,

	@field:SerializedName("instagram_username")
	val instagramUsername: Any? = null,

	@field:SerializedName("username")
	val username: String? = null
)

data class Wallpapers(

	@field:SerializedName("approved_on")
	val approvedOn: String? = null,

	@field:SerializedName("status")
	val status: String? = null
)

data class WorkFromHome(

	@field:SerializedName("status")
	val status: String? = null
)

data class PreviewPhotosItem(

	@field:SerializedName("urls")
	val urls: Urls? = null,

	@field:SerializedName("updated_at")
	val updatedAt: String? = null,

	@field:SerializedName("blur_hash")
	val blurHash: String? = null,

	@field:SerializedName("created_at")
	val createdAt: String? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("slug")
	val slug: String? = null
)

data class CoverPhoto(

	@field:SerializedName("topic_submissions")
	val topicSubmissions: TopicSubmissions? = null,

	@field:SerializedName("current_user_collections")
	val currentUserCollections: List<Any?>? = null,

	@field:SerializedName("color")
	val color: String? = null,

	@field:SerializedName("sponsorship")
	val sponsorship: Any? = null,

	@field:SerializedName("created_at")
	val createdAt: String? = null,

	@field:SerializedName("description")
	val description: String? = null,

	@field:SerializedName("liked_by_user")
	val likedByUser: Boolean? = null,

	@field:SerializedName("urls")
	val urls: Urls? = null,

	@field:SerializedName("alt_description")
	val altDescription: String? = null,

	@field:SerializedName("updated_at")
	val updatedAt: String? = null,

	@field:SerializedName("width")
	val width: Int? = null,

	@field:SerializedName("blur_hash")
	val blurHash: String? = null,

	@field:SerializedName("links")
	val links: Links? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("promoted_at")
	val promotedAt: String? = null,

	@field:SerializedName("user")
	val user: User? = null,

	@field:SerializedName("slug")
	val slug: String? = null,

	@field:SerializedName("height")
	val height: Int? = null,

	@field:SerializedName("likes")
	val likes: Int? = null,

	@field:SerializedName("plus")
	val plus: Boolean? = null,

	@field:SerializedName("premium")
	val premium: Boolean? = null
)

data class Type(

	@field:SerializedName("pretty_slug")
	val prettySlug: String? = null,

	@field:SerializedName("slug")
	val slug: String? = null
)

data class Subcategory(

	@field:SerializedName("pretty_slug")
	val prettySlug: String? = null,

	@field:SerializedName("slug")
	val slug: String? = null
)

data class ColorOfWater(

	@field:SerializedName("status")
	val status: String? = null,

	@field:SerializedName("approved_on")
	val approvedOn: String? = null
)

data class ArchitectureInterior(

	@field:SerializedName("status")
	val status: String? = null,

	@field:SerializedName("approved_on")
	val approvedOn: String? = null
)

data class ArtsCulture(

	@field:SerializedName("approved_on")
	val approvedOn: String? = null,

	@field:SerializedName("status")
	val status: String? = null
)

data class People(

	@field:SerializedName("approved_on")
	val approvedOn: String? = null,

	@field:SerializedName("status")
	val status: String? = null
)

data class Technology(

	@field:SerializedName("approved_on")
	val approvedOn: String? = null,

	@field:SerializedName("status")
	val status: String? = null
)

data class Spirituality(

	@field:SerializedName("approved_on")
	val approvedOn: String? = null,

	@field:SerializedName("status")
	val status: String? = null
)

data class FashionBeauty(

	@field:SerializedName("approved_on")
	val approvedOn: String? = null,

	@field:SerializedName("status")
	val status: String? = null
)

data class Experimental(

	@field:SerializedName("status")
	val status: String? = null,

	@field:SerializedName("approved_on")
	val approvedOn: String? = null
)

data class Category(

	@field:SerializedName("pretty_slug")
	val prettySlug: String? = null,

	@field:SerializedName("slug")
	val slug: String? = null
)

data class Monochrome(

	@field:SerializedName("status")
	val status: String? = null
)

data class Nature(

	@field:SerializedName("approved_on")
	val approvedOn: String? = null,

	@field:SerializedName("status")
	val status: String? = null
)

data class CurrentEvents(

	@field:SerializedName("approved_on")
	val approvedOn: String? = null,

	@field:SerializedName("status")
	val status: String? = null
)

data class Ancestry(

	@field:SerializedName("type")
	val type: Type? = null,

	@field:SerializedName("category")
	val category: Category? = null,

	@field:SerializedName("subcategory")
	val subcategory: Subcategory? = null
)
