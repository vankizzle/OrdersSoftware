﻿// <auto-generated />
using Microsoft.EntityFrameworkCore;
using Microsoft.EntityFrameworkCore.Infrastructure;
using Microsoft.EntityFrameworkCore.Metadata;
using Microsoft.EntityFrameworkCore.Migrations;
using Microsoft.EntityFrameworkCore.Storage.ValueConversion;
using RestAPI2.Data;

namespace RestAPI2.Migrations
{
    [DbContext(typeof(DataContext))]
    [Migration("20190531113132_migrationtest")]
    partial class migrationtest
    {
        protected override void BuildTargetModel(ModelBuilder modelBuilder)
        {
#pragma warning disable 612, 618
            modelBuilder
                .HasAnnotation("ProductVersion", "2.1.8-servicing-32085")
                .HasAnnotation("Relational:MaxIdentifierLength", 128)
                .HasAnnotation("SqlServer:ValueGenerationStrategy", SqlServerValueGenerationStrategy.IdentityColumn);

            modelBuilder.Entity("RestAPI2.Models.Customer", b =>
                {
                    b.Property<int>("ID")
                        .ValueGeneratedOnAdd()
                        .HasAnnotation("SqlServer:ValueGenerationStrategy", SqlServerValueGenerationStrategy.IdentityColumn);

                    b.Property<string>("Address");

                    b.Property<string>("City");

                    b.Property<string>("Country");

                    b.Property<string>("FirstName");

                    b.Property<string>("LastName");

                    b.Property<string>("Phone");

                    b.Property<string>("email");

                    b.Property<string>("password");

                    b.Property<string>("username");

                    b.HasKey("ID");

                    b.ToTable("Customers");
                });

            modelBuilder.Entity("RestAPI2.Models.Good", b =>
                {
                    b.Property<int>("ID")
                        .ValueGeneratedOnAdd()
                        .HasAnnotation("SqlServer:ValueGenerationStrategy", SqlServerValueGenerationStrategy.IdentityColumn);

                    b.Property<string>("Description");

                    b.Property<int>("Is_Discontinued");

                    b.Property<string>("Name");

                    b.Property<int>("PLU");

                    b.Property<double>("Price");

                    b.Property<int>("SupplierID");

                    b.HasKey("ID");

                    b.HasIndex("PLU")
                        .IsUnique();

                    b.HasIndex("SupplierID");

                    b.ToTable("Goods");
                });

            modelBuilder.Entity("RestAPI2.Models.Order", b =>
                {
                    b.Property<int>("ID")
                        .ValueGeneratedOnAdd()
                        .HasAnnotation("SqlServer:ValueGenerationStrategy", SqlServerValueGenerationStrategy.IdentityColumn);

                    b.Property<int>("CustomerID");

                    b.Property<string>("OrderCode");

                    b.Property<string>("OrderStatus");

                    b.Property<double>("OrderTotalPrice");

                    b.HasKey("ID");

                    b.HasIndex("CustomerID");

                    b.HasIndex("OrderCode")
                        .IsUnique()
                        .HasFilter("[OrderCode] IS NOT NULL");

                    b.ToTable("Orders");
                });

            modelBuilder.Entity("RestAPI2.Models.OrderedGoods", b =>
                {
                    b.Property<int>("OrderID");

                    b.Property<int>("GoodID");

                    b.Property<int>("Qtty");

                    b.HasKey("OrderID", "GoodID");

                    b.HasIndex("GoodID");

                    b.ToTable("OrderedGoods");
                });

            modelBuilder.Entity("RestAPI2.Models.Supplier", b =>
                {
                    b.Property<int>("ID")
                        .ValueGeneratedOnAdd()
                        .HasAnnotation("SqlServer:ValueGenerationStrategy", SqlServerValueGenerationStrategy.IdentityColumn);

                    b.Property<string>("SupplierName");

                    b.Property<string>("SupplierPhone");

                    b.HasKey("ID");

                    b.ToTable("Suppliers");
                });

            modelBuilder.Entity("RestAPI2.Models.User", b =>
                {
                    b.Property<int>("ID")
                        .ValueGeneratedOnAdd()
                        .HasAnnotation("SqlServer:ValueGenerationStrategy", SqlServerValueGenerationStrategy.IdentityColumn);

                    b.Property<int>("Is_Boss");

                    b.Property<string>("email");

                    b.Property<string>("password");

                    b.Property<string>("username");

                    b.HasKey("ID");

                    b.ToTable("Users");
                });

            modelBuilder.Entity("RestAPI2.Models.Good", b =>
                {
                    b.HasOne("RestAPI2.Models.Supplier")
                        .WithMany("Goods")
                        .HasForeignKey("SupplierID")
                        .OnDelete(DeleteBehavior.Cascade);
                });

            modelBuilder.Entity("RestAPI2.Models.Order", b =>
                {
                    b.HasOne("RestAPI2.Models.Customer")
                        .WithMany("Orders")
                        .HasForeignKey("CustomerID")
                        .OnDelete(DeleteBehavior.Cascade);
                });

            modelBuilder.Entity("RestAPI2.Models.OrderedGoods", b =>
                {
                    b.HasOne("RestAPI2.Models.Good")
                        .WithMany("OrderedGoods")
                        .HasForeignKey("GoodID")
                        .OnDelete(DeleteBehavior.Cascade);

                    b.HasOne("RestAPI2.Models.Order", "Order")
                        .WithMany("OrderedGoods")
                        .HasForeignKey("OrderID")
                        .OnDelete(DeleteBehavior.Cascade);
                });
#pragma warning restore 612, 618
        }
    }
}
