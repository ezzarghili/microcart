<html>
<head>
    <link uic-remove rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
    <title>Bilderbuch-Stoff.de - Download</title>
</head>
<body>
<uic-fragment name="content">

<#setting locale="de_DE">

    <div class="container">
	    <h1>Downloads für Bestellung ${cart.id[0..4]}</h1>

		<#if cart.containsDownloads()>
	    <br>
			<#if cart.downloadCountExceeded>
                Die maximale Anzahl Downloads wurde erreicht. Bitte kontaktiere uns, wenn Probleme beim Download bestehen.
			<#else>
				<div class="container cart">
					<#list cart.positions as position>
						<#if position.type?? && position.type == "download">
							<div class="row cart-row">
								<div class="cart-image">
									<img src="${position.imageUrl}" alt="${position.title}" />
								</div>
								<div class="cart-description">
									<div class="cart-label">${position.title} <br>
										<#if cart.allowDownload>
											<a href="/shop/download/${cart.id}/${position.articleId}">&gt; Jetzt herunterladen</a>
										<#else>
											Zahlungseingang noch nicht vermerkt.
										</#if>
									</div>
								</div>
							</div>
						</#if>
					</#list>
				</div>
			</#if>
		<#else>
            Die Bestellung beinhaltet keine Downloads.
		</#if>
	</div>

</uic-fragment>
</body>
</html>
