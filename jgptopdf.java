package com.resolver.challenge;

import com.aspose.words.*;

Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

builder.insertImage("Input.jpg");

doc.save("Output.pdf");
