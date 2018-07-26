package com.shadebyte.auctionhouse.api.discordwebhook.embed;


import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class AuthorEmbed {
	String name;
	String url;
	String icon_url;
	String proxy_icon_url;
}