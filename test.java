ArrayList<Polygon> polys = new ArrayList<Polygon>());

 //FRONT
	
  polys.add(new Polygon(new int[] {
    (xstart), (xstart), (xstart + thirdLineX), (xstart + thirdLineX)
   },
   new int[] {
    (ystart + (3 * scale)), (ystart), (ystart - thirdLineY), (ystart + (3 * scale) - thirdLineY)
    }, 4)); //[0,0]

   polys.add(new Polygon(new int[] {
     (xstart + thirdLineX), (xstart + thirdLineX), (xstart + (8 * scale) - thirdLineX), (xstart + (8 * scale) - thirdLineX)
    },
    new int[] {
     (ystart + (3 * scale) - thirdLineY), (ystart - thirdLineY), (ystart - (5 * scale) + thirdLineY), (ystart - (2 * scale) + thirdLineY)
    }, 4)); //[0,1]

   polys.add(new Polygon(new int[] {
     (xstart + (8 * scale) - thirdLineX), (xstart + (8 * scale) - thirdLineX), (xstart + (8 * scale)), (xstart + (8 * scale))
    },
    new int[] {
     (ystart - (2 * scale) + thirdLineY), (ystart - (5 * scale) + thirdLineY), (ystart - (5 * scale)), (ystart - (2 * scale))
    }, 4)); //[0,2]

   polys.add(new Polygon(new int[] {
     (xstart), (xstart), (xstart + thirdLineX), (xstart + thirdLineX)
    },
    new int[] {
     (ystart + (6 * scale)), (ystart + (3 * scale)), (ystart + (3 * scale) - thirdLineY), (ystart + (6 * scale) - thirdLineY)
    }, 4)); //[1,0]

   polys.add(new Polygon(new int[] {
     (xstart + thirdLineX), (xstart + thirdLineX), (xstart + (8 * scale) - thirdLineX), (xstart + (8 * scale) - thirdLineX)
    },
    new int[] {
     (ystart + (6 * scale) - thirdLineY), (ystart + (3 * scale) - thirdLineY), (ystart - (2 * scale) + thirdLineY), (ystart + (1 * scale) + thirdLineY)
    }, 4)); //[1,1]

   polys.add(new Polygon(new int[] {
     (xstart + (8 * scale) - thirdLineX), (xstart + (8 * scale) - thirdLineX), (xstart + (8 * scale)), (xstart + (8 * scale))
    },
    new int[] {
     (ystart + (1 * scale) + thirdLineY), (ystart - (2 * scale) + thirdLineY), (ystart - (2 * scale)), (ystart + (1 * scale))
    }, 4)); //[1,2]

   polys.add(new Polygon(new int[] {
     (xstart), (xstart), (xstart + thirdLineX), (xstart + thirdLineX)
    },
    new int[] {
     (ystart + (9 * scale)), (ystart + (6 * scale)), (ystart + (6 * scale) - thirdLineY), (ystart + (9 * scale) - thirdLineY)
    }, 4)); //[2,0]

   polys.add(new Polygon(new int[] {
     (xstart + thirdLineX), (xstart + thirdLineX), (xstart + (8 * scale) - thirdLineX), (xstart + (8 * scale) - thirdLineX)
    },
    new int[] {
     (ystart + (9 * scale) - thirdLineY), (ystart + (6 * scale) - thirdLineY), (ystart + (1 * scale) + thirdLineY), (ystart + (4 * scale) + thirdLineY)
    }, 4)); //[2,1]

   polys.add(new Polygon(new int[] {
     (xstart + (8 * scale) - thirdLineX), (xstart + (8 * scale) - thirdLineX), (xstart + (8 * scale)), (xstart + (8 * scale))
    },
    new int[] {
     (ystart + (4 * scale) + thirdLineY), (ystart + (1 * scale) + thirdLineY), (ystart + (1 * scale)), (ystart + (4 * scale))
    }, 4)); //[2,2]






 

   //LEFT
   g.setColor(Color.blue));

   polys.add(new Polygon(new int[] {
     (xstart - (8 * scale) + thirdLineX), (xstart - (8 * scale) + thirdLineX), (xstart - (8 * scale)), (xstart - (8 * scale))
    },
    new int[] {
     (ystart - (2 * scale) + thirdLineY), (ystart - (5 * scale) + thirdLineY), (ystart - (5 * scale)), (ystart - (2 * scale))
    }, 4)); //[0,0]

   polys.add(new Polygon(new int[] {
     (xstart - thirdLineX), (xstart - thirdLineX), (xstart - (8 * scale) + thirdLineX), (xstart - (8 * scale) + thirdLineX)
    },
    new int[] {
     (ystart + (3 * scale) - thirdLineY), (ystart - thirdLineY), (ystart - (5 * scale) + thirdLineY), (ystart - (2 * scale) + thirdLineY)
    }, 4)); //[0,1]

   polys.add(new Polygon(new int[] {
     (xstart), (xstart), (xstart - thirdLineX), (xstart - thirdLineX)
    },
    new int[] {
     (ystart + (3 * scale)), (ystart), (ystart - thirdLineY), (ystart + (3 * scale) - thirdLineY)
    }, 4)); //[0,2]

   polys.add(new Polygon(new int[] {
     (xstart - (8 * scale) + thirdLineX), (xstart - (8 * scale) + thirdLineX), (xstart - (8 * scale)), (xstart - (8 * scale))
    },
    new int[] {
     (ystart + (1 * scale) + thirdLineY), (ystart - (2 * scale) + thirdLineY), (ystart - (2 * scale)), (ystart + (1 * scale))
    }, 4)); //[1,0]			

   polys.add(new Polygon(new int[] {
     (xstart - thirdLineX), (xstart - thirdLineX), (xstart - (8 * scale) + thirdLineX), (xstart - (8 * scale) + thirdLineX)
    },
    new int[] {
     (ystart + (6 * scale) - thirdLineY), (ystart + (3 * scale) - thirdLineY), (ystart - (2 * scale) + thirdLineY), (ystart + (1 * scale) + thirdLineY)
    }, 4)); //[1,1]

   polys.add(new Polygon(new int[] {
     (xstart), (xstart), (xstart - thirdLineX), (xstart - thirdLineX)
    },
    new int[] {
     (ystart + (6 * scale)), (ystart + (3 * scale)), (ystart + (3 * scale) - thirdLineY), (ystart + (6 * scale) - thirdLineY)
    }, 4)); //[1,2]

   polys.add(new Polygon(new int[] {
     (xstart - (8 * scale) + thirdLineX), (xstart - (8 * scale) + thirdLineX), (xstart - (8 * scale)), (xstart - (8 * scale))
    },
    new int[] {
     (ystart + (4 * scale) + thirdLineY), (ystart + (1 * scale) + thirdLineY), (ystart + (1 * scale)), (ystart + (4 * scale))
    }, 4)); //[2,0]

   polys.add(new Polygon(new int[] {
     (xstart - thirdLineX), (xstart - thirdLineX), (xstart - (8 * scale) + thirdLineX), (xstart - (8 * scale) + thirdLineX)
    },
    new int[] {
     (ystart + (9 * scale) - thirdLineY), (ystart + (6 * scale) - thirdLineY), (ystart + (1 * scale) + thirdLineY), (ystart + (4 * scale) + thirdLineY)
    }, 4)); //[2,1]

   polys.add(new Polygon(new int[] {
     (xstart), (xstart), (xstart - thirdLineX), (xstart - thirdLineX)
    },
    new int[] {
     (ystart + (9 * scale)), (ystart + (6 * scale)), (ystart + (6 * scale) - thirdLineY), (ystart + (9 * scale) - thirdLineY)
    }, 4)); //[2,2]


	

   //BACK
   polys.add(new Polygon(new int[] {
     (backStartX), (backStartX), (backStartX + thirdLineX), (backStartX + thirdLineX)
    },
    new int[] {
     (backStartY + (3 * scale)), (backStartY), (backStartY - thirdLineY), (backStartY + (3 * scale) - thirdLineY)
    }, 4)); //[0,2]

   polys.add(new Polygon(new int[] {
     (backStartX + thirdLineX), (backStartX + thirdLineX), (backStartX + (8 * scale) - thirdLineX), (backStartX + (8 * scale) - thirdLineX)
    },
    new int[] {
     (backStartY + (3 * scale) - thirdLineY), (backStartY - thirdLineY), (backStartY - (5 * scale) + thirdLineY), (backStartY - (2 * scale) + thirdLineY)
    }, 4)); //[0,1]

   polys.add(new Polygon(new int[] {
     (backStartX + (8 * scale) - thirdLineX), (backStartX + (8 * scale) - thirdLineX), (backStartX + (8 * scale)), (backStartX + (8 * scale))
    },
    new int[] {
     (backStartY - (2 * scale) + thirdLineY), (backStartY - (5 * scale) + thirdLineY), (backStartY - (5 * scale)), (backStartY - (2 * scale))
    }, 4)); //[0,0]

   polys.add(new Polygon(new int[] {
     (backStartX), (backStartX), (backStartX + thirdLineX), (backStartX + thirdLineX)
    },
    new int[] {
     (backStartY + (6 * scale)), (backStartY + (3 * scale)), (backStartY + (3 * scale) - thirdLineY), (backStartY + (6 * scale) - thirdLineY)
    }, 4)); //[1,2]

   polys.add(new Polygon(new int[] {
     (backStartX + thirdLineX), (backStartX + thirdLineX), (backStartX + (8 * scale) - thirdLineX), (backStartX + (8 * scale) - thirdLineX)
    },
    new int[] {
     (backStartY + (6 * scale) - thirdLineY), (backStartY + (3 * scale) - thirdLineY), (backStartY - (2 * scale) + thirdLineY), (backStartY + (1 * scale) + thirdLineY)
    }, 4)); //[1,1]

   polys.add(new Polygon(new int[] {
     (backStartX + (8 * scale) - thirdLineX), (backStartX + (8 * scale) - thirdLineX), (backStartX + (8 * scale)), (backStartX + (8 * scale))
    },
    new int[] {
     (backStartY + (1 * scale) + thirdLineY), (backStartY - (2 * scale) + thirdLineY), (backStartY - (2 * scale)), (backStartY + (1 * scale))
    }, 4)); //[1,0]

   polys.add(new Polygon(new int[] {
     (backStartX), (backStartX), (backStartX + thirdLineX), (backStartX + thirdLineX)
    },
    new int[] {
     (backStartY + (9 * scale)), (backStartY + (6 * scale)), (backStartY + (6 * scale) - thirdLineY), (backStartY + (9 * scale) - thirdLineY)
    }, 4)); //[2,2]

   polys.add(new Polygon(new int[] {
     (backStartX + thirdLineX), (backStartX + thirdLineX), (backStartX + (8 * scale) - thirdLineX), (backStartX + (8 * scale) - thirdLineX)
    },
    new int[] {
     (backStartY + (9 * scale) - thirdLineY), (backStartY + (6 * scale) - thirdLineY), (backStartY + (1 * scale) + thirdLineY), (backStartY + (4 * scale) + thirdLineY)
    }, 4)); //[2,1]

   polys.add(new Polygon(new int[] {
     (backStartX + (8 * scale) - thirdLineX), (backStartX + (8 * scale) - thirdLineX), (backStartX + (8 * scale)), (backStartX + (8 * scale))
    },
    new int[] {
     (backStartY + (4 * scale) + thirdLineY), (backStartY + (1 * scale) + thirdLineY), (backStartY + (1 * scale)), (backStartY + (4 * scale))
    }, 4)); //[2,0]


   //RIGHT
   polys.add(new Polygon(new int[] {
     (rightStartX - (8 * scale) + thirdLineX), (rightStartX - (8 * scale) + thirdLineX), (rightStartX - (8 * scale)), (rightStartX - (8 * scale))
    },
    new int[] {
     (rightStartY - (2 * scale) + thirdLineY), (rightStartY - (5 * scale) + thirdLineY), (rightStartY - (5 * scale)), (rightStartY - (2 * scale))
    }, 4)); //[0,2]

   polys.add(new Polygon(new int[] {
     (rightStartX - thirdLineX), (rightStartX - thirdLineX), (rightStartX - (8 * scale) + thirdLineX), (rightStartX - (8 * scale) + thirdLineX)
    },
    new int[] {
     (rightStartY + (3 * scale) - thirdLineY), (rightStartY - thirdLineY), (rightStartY - (5 * scale) + thirdLineY), (rightStartY - (2 * scale) + thirdLineY)
    }, 4)); //[0,1]

   polys.add(new Polygon(new int[] {
     (rightStartX), (rightStartX), (rightStartX - thirdLineX), (rightStartX - thirdLineX)
    },
    new int[] {
     (rightStartY + (3 * scale)), (rightStartY), (rightStartY - thirdLineY), (rightStartY + (3 * scale) - thirdLineY)
    }, 4)); //[0,0]

   polys.add(new Polygon(new int[] {
     (rightStartX - (8 * scale) + thirdLineX), (rightStartX - (8 * scale) + thirdLineX), (rightStartX - (8 * scale)), (rightStartX - (8 * scale))
    },
    new int[] {
     (rightStartY + (1 * scale) + thirdLineY), (rightStartY - (2 * scale) + thirdLineY), (rightStartY - (2 * scale)), (rightStartY + (1 * scale))
    }, 4)); //[1,2]			

	

   polys.add(new Polygon(new int[] {
     (rightStartX - thirdLineX), (rightStartX - thirdLineX), (rightStartX - (8 * scale) + thirdLineX), (rightStartX - (8 * scale) + thirdLineX)
    },
    new int[] {
     (rightStartY + (6 * scale) - thirdLineY), (rightStartY + (3 * scale) - thirdLineY), (rightStartY - (2 * scale) + thirdLineY), (rightStartY + (1 * scale) + thirdLineY)
    }, 4)); //[1,1]

   polys.add(new Polygon(new int[] {
     (rightStartX), (rightStartX), (rightStartX - thirdLineX), (rightStartX - thirdLineX)
    },
    new int[] {
     (rightStartY + (6 * scale)), (rightStartY + (3 * scale)), (rightStartY + (3 * scale) - thirdLineY), (rightStartY + (6 * scale) - thirdLineY)
    }, 4)); //[1,0]

   polys.add(new Polygon(new int[] {
     (rightStartX - (8 * scale) + thirdLineX), (rightStartX - (8 * scale) + thirdLineX), (rightStartX - (8 * scale)), (rightStartX - (8 * scale))
    },
    new int[] {
     (rightStartY + (4 * scale) + thirdLineY), (rightStartY + (1 * scale) + thirdLineY), (rightStartY + (1 * scale)), (rightStartY + (4 * scale))
    }, 4)); //[2,2]

   polys.add(new Polygon(new int[] {
     (rightStartX - thirdLineX), (rightStartX - thirdLineX), (rightStartX - (8 * scale) + thirdLineX), (rightStartX - (8 * scale) + thirdLineX)
    },
    new int[] {
     (rightStartY + (9 * scale) - thirdLineY), (rightStartY + (6 * scale) - thirdLineY), (rightStartY + (1 * scale) + thirdLineY), (rightStartY + (4 * scale) + thirdLineY)
    }, 4)); //[2,1]

   polys.add(new Polygon(new int[] {
     (rightStartX), (rightStartX), (rightStartX - thirdLineX), (rightStartX - thirdLineX)
    },
    new int[] {
     (rightStartY + (9 * scale)), (rightStartY + (6 * scale)), (rightStartY + (6 * scale) - thirdLineY), (rightStartY + (9 * scale) - thirdLineY)
    }, 4)); //[2,0]
	
	
	//TOP
 polys.add(new Polygon(new int[] {
    (xstart - (8 * scale)), (xstart - (8 * scale) + thirdLineX), (xstart - thirdLineX), (xstart - (8 * scale) + thirdLineX)
   },
   new int[] {
    (ystart - (5 * scale)), (ystart - (5 * scale) - thirdLineY), (ystart - (5 * scale)), (ystart - (5 * scale) + thirdLineY)
   }, 4)); //[0,0]

  polys.add(new Polygon(new int[] {
    (xstart - (8 * scale) + thirdLineX), (xstart - thirdLineX), (xstart), (xstart - thirdLineX)
   },
   new int[] {
    (ystart - (5 * scale) - thirdLineY), (ystart - (10 * scale) + thirdLineY), (ystart - (5 * scale) - thirdLineY), (ystart - (5 * scale))
   }, 4)); //[0,1]

  polys.add(new Polygon(new int[] {
    (xstart - thirdLineX), (xstart), (xstart + thirdLineX), (xstart)
   },
   new int[] {
    (ystart - (10 * scale) + thirdLineY), (ystart - (10 * scale)), (ystart - (10 * scale) + thirdLineY), (ystart - (5 * scale) - thirdLineY)
   }, 4)); //[0,2]

  polys.add(new Polygon(new int[] {
    (xstart - (8 * scale) + thirdLineX), (xstart - thirdLineX), (xstart), (xstart - thirdLineX)
   },
   new int[] {
    (ystart - (5 * scale) + thirdLineY), (ystart - (5 * scale)), (ystart - (5 * scale) + thirdLineY), (ystart - thirdLineY)
   }, 4)); //[1,0]

  polys.add(new Polygon(new int[] {
    (xstart - thirdLineX), (xstart), (xstart + thirdLineX), (xstart)
   },
   new int[] {
    (ystart - (5 * scale)), (ystart - (5 * scale) - thirdLineY), (ystart - (5 * scale)), (ystart - (5 * scale) + thirdLineY)
   }, 4)); //[1,1]

  polys.add(new Polygon(new int[] {
    (xstart), (xstart + thirdLineX), (xstart + (8 * scale) - thirdLineX), (xstart + thirdLineX)
   },
   new int[] {
    (ystart - (5 * scale) - thirdLineY), (ystart - (10 * scale) + thirdLineY), (ystart - (5 * scale) - thirdLineY), (ystart - (5 * scale))
   }, 4)); //[1,2]

  polys.add(new Polygon(new int[] {
    (xstart - thirdLineX), (xstart), (xstart + thirdLineX), (xstart)
   },
   new int[] {
    (ystart - thirdLineY), (ystart - (5 * scale) + thirdLineY), (ystart - thirdLineY), (ystart)
   }, 4)); //[2,0]

  polys.add(new Polygon(new int[] {
    (xstart), (xstart + thirdLineX), (xstart + (8 * scale) - thirdLineX), (xstart + thirdLineX)
   },
   new int[] {
    (ystart - (5 * scale) + thirdLineY), (ystart - (5 * scale)), (ystart - (5 * scale) + thirdLineY), (ystart - thirdLineY)
   }, 4)); //[2,1]

  polys.add(new Polygon(new int[] {
    (xstart + thirdLineX), (xstart + (8 * scale) - thirdLineX), (xstart + (8 * scale)), (xstart + (8 * scale) - thirdLineX)
   },
   new int[] {
    (ystart - (5 * scale)), (ystart - (5 * scale) - thirdLineY), (ystart - (5 * scale)), (ystart - (5 * scale) + thirdLineY)
   }, 4)); //[2,2]

	
   //BOT
   polys.add(new Polygon(new int[] {
     (botStartX - (8 * scale)), (botStartX - (8 * scale) + thirdLineX), (botStartX - thirdLineX), (botStartX - (8 * scale) + thirdLineX)
    },
    new int[] {
     (botStartY - (5 * scale)), (botStartY - (5 * scale) - thirdLineY), (botStartY - (5 * scale)), (botStartY - (5 * scale) + thirdLineY)
    }, 4)); //[2,0]

   polys.add(new Polygon(new int[] {
     (botStartX - (8 * scale) + thirdLineX), (botStartX - thirdLineX), (botStartX), (botStartX - thirdLineX)
    },
    new int[] {
     (botStartY - (5 * scale) - thirdLineY), (botStartY - (10 * scale) + thirdLineY), (botStartY - (5 * scale) - thirdLineY), (botStartY - (5 * scale))
    }, 4)); //[2,1]

   polys.add(new Polygon(new int[] {
     (botStartX - thirdLineX), (botStartX), (botStartX + thirdLineX), (botStartX)
    },
    new int[] {
     (botStartY - (10 * scale) + thirdLineY), (botStartY - (10 * scale)), (botStartY - (10 * scale) + thirdLineY), (botStartY - (5 * scale) - thirdLineY)
    }, 4)); //[2,2]

   polys.add(new Polygon(new int[] {
     (botStartX - (8 * scale) + thirdLineX), (botStartX - thirdLineX), (botStartX), (botStartX - thirdLineX)
    },
    new int[] {
     (botStartY - (5 * scale) + thirdLineY), (botStartY - (5 * scale)), (botStartY - (5 * scale) + thirdLineY), (botStartY - thirdLineY)
    }, 4)); //[1,0]

   polys.add(new Polygon(new int[] {
     (botStartX - thirdLineX), (botStartX), (botStartX + thirdLineX), (botStartX)
    },
    new int[] {
     (botStartY - (5 * scale)), (botStartY - (5 * scale) - thirdLineY), (botStartY - (5 * scale)), (botStartY - (5 * scale) + thirdLineY)
    }, 4)); //[1,1]

   polys.add(new Polygon(new int[] {
     (botStartX), (botStartX + thirdLineX), (botStartX + (8 * scale) - thirdLineX), (botStartX + thirdLineX)
    },
    new int[] {
     (botStartY - (5 * scale) - thirdLineY), (botStartY - (10 * scale) + thirdLineY), (botStartY - (5 * scale) - thirdLineY), (botStartY - (5 * scale))
    }, 4)); //[1,2]

   polys.add(new Polygon(new int[] {
     (botStartX - thirdLineX), (botStartX), (botStartX + thirdLineX), (botStartX)
    },
    new int[] {
     (botStartY - thirdLineY), (botStartY - (5 * scale) + thirdLineY), (botStartY - thirdLineY), (botStartY)
    }, 4)); //[0,0]

   polys.add(new Polygon(new int[] {
     (botStartX), (botStartX + thirdLineX), (botStartX + (8 * scale) - thirdLineX), (botStartX + thirdLineX)
    },
    new int[] {
     (botStartY - (5 * scale) + thirdLineY), (botStartY - (5 * scale)), (botStartY - (5 * scale) + thirdLineY), (botStartY - thirdLineY)
    }, 4)); //[0,1]

   polys.add(new Polygon(new int[] {
     (botStartX + thirdLineX), (botStartX + (8 * scale) - thirdLineX), (botStartX + (8 * scale)), (botStartX + (8 * scale) - thirdLineX)
    },
    new int[] {
     (botStartY - (5 * scale)), (botStartY - (5 * scale) - thirdLineY), (botStartY - (5 * scale)), (botStartY - (5 * scale) + thirdLineY)
    }, 4)); //[0,2]
