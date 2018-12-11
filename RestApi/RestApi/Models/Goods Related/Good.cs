﻿using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations.Schema;
using System.Linq;
using System.Threading.Tasks;

namespace RestApi.Models
{
    public class Good
    {
        public int ID { get; set; }

        public int DetailID { get; set; }
        public GoodDetail Detail{get;set;}
        public Supplier Supplier { get; set; }
        public ICollection<GoodOrder> GoodOrders { get; set; }
    }
}
